import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.DecimalFormat;

class SimpletronInterpreter {

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


void PrintWelcomeMessage(){
}

NumberFormat getNumberFormatter() {
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMinimumIntegerDigits(4);
	if (nf instanceof DecimalFormat) {
		DecimalFormat df = (DecimalFormat)nf;
		df.setPositivePrefix("+");
		df.setNegativePrefix("-");
		df.setGroupingSize(4);
	}
	return nf;
}

int parseInteger(NumberFormat nf, String line) throws java.text.ParseException {
	int n;
	if (line.charAt(0) != '-' && line.charAt(0) != '+') {
		((DecimalFormat)nf).setPositivePrefix("");
		n = nf.parse(line).intValue();
		((DecimalFormat)nf).setPositivePrefix("+");
	}
	else {
		n = nf.parse(line).intValue();
	}
	return n;
}


int LoadProgram (String fileName, int [] memory) {
	int counter = 0; 
        try {
	BufferedReader is = new BufferedReader(
	new FileReader ( fileName ));
	String line = is.readLine();
	boolean stop = false;
	NumberFormat nf = getNumberFormatter();
	while ( line !=null && !stop ){
	  if (counter>=memory.length){
System.out.println("Program too big to fit in memory.");
stop = true;
	  }
	  else {
//System.out.println(line);
	  memory[counter]= nf.parse(line).intValue();
	  if (memory[counter]==-9999){
	      stop=true;
	  }


		counter++;
		line = is.readLine();
		}
	}
	is.close();
        } catch (Exception e) {
	    System.out.println("Error while reading program from file " + fileName + ".  Counter=" + counter);
            System.out.println(e.getMessage());
            counter = 0;			
        }
	return counter;
}

void executeProgram(int[]memory,int numInst){
	int instructionCounter=0;
	int accumulator=0;
	int operationCode=0;
	int operand=0;
	int instructionRegister=0;
	boolean halt=false;
	NumberFormat nf = getNumberFormatter();

	try {
	BufferedReader stdIn = new BufferedReader( new InputStreamReader (System.in) );
	String line;


while ( !halt ){

	instructionRegister=memory[instructionCounter];
	operationCode=instructionRegister/100;
	operand=instructionRegister%100;

	switch (operationCode) {
		case READ:
			System.out.print("READ> ");
			line = stdIn.readLine();
			memory[operand] = parseInteger(nf, line);
			instructionCounter++;
			break;

		case WRITE:
			System.out.println("WRITE> "+memory[operand]);
			instructionCounter++;
			break;

		case HALT:
			halt = true;
			break;

		case LOAD:
			accumulator = memory[operand];
			instructionCounter++;

			break;

		case STORE:
			memory[operand] = accumulator;
			instructionCounter++;
			break;

		case ADD:
			accumulator += memory[operand];
			instructionCounter++;
			break;

		case SUBTRACT:
			accumulator -= memory[operand];
			instructionCounter++;
			break;
		case MULTIPLY:
			accumulator *= memory[operand];
			instructionCounter++;
			break;
		case DIVIDE:
			accumulator /= memory[operand];
			instructionCounter++;
			break;
		case BRANCH:
			instructionCounter = operand;
			
			break;

		case BRANCHZERO:
			if  ( accumulator == 0)

			{instructionCounter = operand;

				}
			else {
				instructionCounter++;
			}
			break;

		case BRANCHNEG:
			if  ( accumulator < 0)

			{instructionCounter = operand;

				}
			else {
				instructionCounter++;
			}
			break;



		default:
			System.out.println("Invalid operation code " + operationCode + " at instruction #" + instructionCounter);
			System.out.println("halting execution");
			halt = true;
			break;
	}

}
	stdIn.close();
	} catch (Exception e) {
            System.out.println("Error while executing program: " + e.getMessage());
	}
	// dump registers and memory
	System.out.println("REGISTERS:");
	System.out.println("MEMORY:");
	System.out.print("  ");
	for (int i = 0; i < 10; i++) {
		System.out.print("     "+i);
	}

        for (int i = 0; i < memory.length; i++) {
		if (i % 10 == 0) {
			System.out.println();
			System.out.print(i);
		}
		System.out.print(" " + nf.format(memory[i]));
        }
}

	void executeProgramFromFile(String fileName) {
		PrintWelcomeMessage();
		int[] memory = new int[100];
		int count = LoadProgram(fileName, memory);
		executeProgram(memory, count);
	}

	public static void main( String[] args)
	{
	  if (args.length==0)
	   {
	    System.out.println("Missing program File Name");
	    return; 
	   }
//System.out.println("args.length = " + args.length);
//for (int i = 0; i < args.length; i++)
//  System.out.println("args["+i+"]="+args[i]);
	 
	 
         String filename = args[0];
         new SimpletronInterpreter().executeProgramFromFile(filename);
 	}
}

