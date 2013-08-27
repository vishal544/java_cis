
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.FileWriter;
import java.io.IOException;

public class SMLProgram
	{

	public SMLProgram()
		{
		flags = new int[100];
		for (int i = 0; i < 100; i++) {
			flags[i] = -1;
		}
		program = new int[100];
		currInstructionCount = 0;
		currDataIndex = 100;
		}

	public int getCurrentInstructionNumber()
		{
			return currInstructionCount;
		}


	public int getNextDataLocation()
		{
			currDataIndex--;
			return currDataIndex;
		}

	public void addInstruction(int instruction)
		{
			program[currInstructionCount] = instruction;
			currInstructionCount++;

		}

	public void addFlaggedInstruction(int instruction, int flag)
		{
			flags[currInstructionCount] = flag;
			program[currInstructionCount] = instruction;
			currInstructionCount++;


		}

	public boolean isInstructionFlagged(int i) {
		return (flags[i] != -1);
	}

	public int getFlagValue(int i) {
		return flags[i];
	}

	public int getInstruction(int i) {
		return program[i];
	}

	public void replaceInstruction(int i, int newInstruction) {
		program[i] = newInstruction;
	}

	public void writeToFile(String outputFile) throws IOException{
	FileWriter out = new FileWriter(outputFile);
	
	NumberFormat nf = getNumberFormatter();
	 for (int i = 0; i < program.length; i++) {
		

		out.write(nf.format(program[i])+"\n");
        }
out.close();
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

private int[] flags;

private int[] program;

private int currInstructionCount;

private int currDataIndex;
}