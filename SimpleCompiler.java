import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class SimpleCompiler
{
	final int READ = 10;
	final int WRITE = 11;
	final int LOAD = 20;
	final int STORE = 21;
	final int ADD = 30;
	final int SUBTRACT = 31;
	final int DIVIDE = 32;
	final int MULTIPLY = 33;
	final int BRANCH = 40;
	final int BRANCHNEG = 41;
	final int BRANCHZERO = 42;
	final int HALT = 43;

	private String convertInfixToPostfix(String infixExpression) {
		StringBuffer postfixExpression = new StringBuffer();
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < infixExpression.length()) {
			char ch = infixExpression.charAt(i);
			i++;
			if (ch == '(') {
				stack.push(ch);
			}
			else if (ch == ')') {
				char ch2 = stack.pop();
				while (ch2 != '(') {
					postfixExpression.append(' ');
					postfixExpression.append(ch2);
					ch2 = stack.pop();
				}
			}
			else if (ch == '+' || ch == '-') {
				while (!stack.empty() && (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/')) {
					postfixExpression.append(' ');
					postfixExpression.append( stack.pop() );
				}
				stack.push(ch);
			}
			else if (ch == '*' || ch == '/') {
				while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
					postfixExpression.append(' ');
					postfixExpression.append( stack.pop() );
				}
				stack.push(ch);
			}
			else if (Character.isDigit(ch)) {
				postfixExpression.append(' ');
				postfixExpression.append(ch);
				while (i < infixExpression.length() && Character.isDigit( infixExpression.charAt(i) )) {
					postfixExpression.append(infixExpression.charAt(i));
					i++;
				}
			}
			else if (Character.isLetter(ch)) {
				postfixExpression.append(' ');
				postfixExpression.append(ch);
			}

		}
		while (!stack.empty()) {
			postfixExpression.append(' ');
			postfixExpression.append( stack.pop() );
		}

		return postfixExpression.toString().trim();
	}

	private void generateInstructionsForPostfix(char lvar, String postfixExpression, SymbolTable table, SMLProgram program) {
		String[] tokens = postfixExpression.split("\\s", 0);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+")) {
				int instruction2 = ADD*100 + stack.pop();
				int instruction1 = LOAD*100 + stack.pop();
				program.addInstruction(instruction1);
				program.addInstruction(instruction2);
				int tmpLocation = program.getNextDataLocation();
				program.addInstruction( STORE*100 + tmpLocation );
				stack.push(tmpLocation);
			}
			else if (tokens[i].equals("-")) {
				int instruction2 = SUBTRACT*100 + stack.pop();
				int instruction1 = LOAD*100 + stack.pop();
				program.addInstruction(instruction1);
				program.addInstruction(instruction2);
				int tmpLocation = program.getNextDataLocation();
				program.addInstruction( STORE*100 + tmpLocation );
				stack.push(tmpLocation);

			}
		
			else if (tokens[i].equals("*")) {
				int instruction2 = MULTIPLY*100 + stack.pop();
				int instruction1 = LOAD*100 + stack.pop();
				program.addInstruction(instruction1);
				program.addInstruction(instruction2);
				int tmpLocation = program.getNextDataLocation();
				program.addInstruction( STORE*100 + tmpLocation );
				stack.push(tmpLocation);

			}
			else if (tokens[i].equals("/")) {
				int instruction2 = DIVIDE*100 + stack.pop();
				int instruction1 = LOAD*100 + stack.pop();
				program.addInstruction(instruction1);
				program.addInstruction(instruction2);
				int tmpLocation = program.getNextDataLocation();
				program.addInstruction( STORE*100 + tmpLocation );
				stack.push(tmpLocation);

			}
			else if (Character.isDigit( tokens[i].charAt(0) )) {
				int constValue = Integer.parseInt(tokens[i]);
				if (!table.hasConstant(constValue)) {
					int t = program.getNextDataLocation();
					program.replaceInstruction(t, constValue);
					table.insertConstant(constValue, t);

				}
				int constLocation = table.getConstantLocation(constValue);
				stack.push(constLocation);
				
			}
			else if (Character.isLetter( tokens[i].charAt(0) )) {
				char var = tokens[i].charAt(0);
				if (!table.hasVariable(var)) {
					table.insertVariable(var, program.getNextDataLocation());
				}
				int varLocation = table.getVariableLocation(var);
				stack.push(varLocation);
			}

		}
		program.addInstruction(LOAD*100 + stack.pop());
		if (!table.hasVariable(lvar)) {
			table.insertVariable(lvar, program.getNextDataLocation());
		}
		int lvarLocation = table.getVariableLocation(lvar);
		program.addInstruction(STORE*100 + lvarLocation);

	}

	
	private void parseLine( String line, SymbolTable table, SMLProgram program)
		{
		 String[] tokens = line.split("\\s",3);

		 String lineNoStr = tokens[0];
		 String command = tokens[1];
		int lineNo = Integer.parseInt(lineNoStr);

		 table.insertLineNumber(lineNo, program.getCurrentInstructionNumber());

		 if (command.equalsIgnoreCase("rem"))
		    {
			// nothing to do

		    }
		 else if (command.equalsIgnoreCase ("input"))
		    {
			char variable = tokens[2].charAt(0);
			int variableMemLocation;
			if (!table.hasVariable(variable)) {
				table.insertVariable((int)variable, program.getNextDataLocation());
			}
			variableMemLocation = table.getVariableLocation(variable);
			program.addInstruction(READ*100 + variableMemLocation);
		}
		else if (command.equalsIgnoreCase ("let"))
		    {
			String[] lettokens = tokens[2].split("\\s", 3);
			char var = lettokens[0].charAt(0);
			String infixExpression = lettokens[2];
			String postfixExpression = convertInfixToPostfix(infixExpression);
//System.out.println(postfixExpression);
			generateInstructionsForPostfix(var, postfixExpression, table, program);
		}
		else if (command.equalsIgnoreCase ("if"))
		    {
			String[] ifgototokens = tokens[2].split("\\s", 5);
			char varA = ifgototokens[0].charAt(0);
			String op = ifgototokens[1];
			char varB = ifgototokens[2].charAt(0);
			int jmpLineNo = Integer.parseInt(ifgototokens[4]);
			if (op.equals("==")) {
			}
			else if (op.equals("!=")) {
			}
			else if (op.equals("<")) {
			}
			else if (op.equals("<=")) {
			}
			else if (op.equals(">")) {
			}
			else if (op.equals(">=")) {
			}
		}
		else if (command.equalsIgnoreCase ("print"))
		    {
		}
		else if (command.equalsIgnoreCase ("goto"))
		    {
		}
		else if (command.equalsIgnoreCase ("end"))
		    {
		}
		else
		    {
		}
	}

	private void firstPass(String inputFileName, SymbolTable table, SMLProgram program) throws IOException {
		String line;


		BufferedReader in = new BufferedReader(
					new FileReader ( inputFileName ));

		line = in.readLine();

		while (line != null)
			{
			parseLine(line,table,program);
			line = in.readLine();

			}

			in.close();


	}

	private void secondPass(SymbolTable table, SMLProgram program) {
		int numInstructions = program.getCurrentInstructionNumber();
		for (int i = 0; i < numInstructions; i++) {
			if (program.isInstructionFlagged(i)) {
				int lineNumber = program.getFlagValue(i);
				int location = table.getLineNumberLocation(lineNumber);
				int newInstruction = program.getInstruction(i)+location;
				program.replaceInstruction(i, newInstruction);
			}
		}
	}

	public void compile(String inputFileName, String outputFileName)
               {
		SymbolTable table = new SymbolTable();
		SMLProgram program = new SMLProgram();
		try{
			firstPass(inputFileName, table, program);

			secondPass(table,program);
			program.writeToFile(outputFileName);
		} catch (Exception e) {
		    System.out.println("Error while reading program from file " + inputFileName);
        	    System.out.println(e.getMessage());
		e.printStackTrace();
        			
     		   }	

	        }
		


public static void main(String[] args) 
      {

	  if (args.length != 2)
	   {
	    System.out.println("Missing input or output File Name");
	    return; 
	   }
	 
	 
         String inputFile = args[0];
	String outputFile = args[1];


	SimpleCompiler compiler = new SimpleCompiler();
	compiler.compile(inputFile,outputFile);
      }
}