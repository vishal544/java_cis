public class SymbolTable
	{

		public static final char CONSTANT = 'c';
		public static final char LINE_NUMBER = 'l';
		public static final char VARIABLE = 'v';



	public SymbolTable()
		{
		tableEntries = new TableEntry[100];
		numEntries = 0;
		}

	public void insertLineNumber(int symbol,int location) {
		TableEntry entry = new TableEntry(symbol, LINE_NUMBER, location);
		tableEntries[numEntries] = entry;
		numEntries++;
	}

	public boolean hasLineNumber(int lineNumber) {
		boolean found = false;
		for (int i = 0; i < numEntries && !found; i++) {
			if (tableEntries[i].getType() == LINE_NUMBER && tableEntries[i].getSymbol() == lineNumber) {
				found = true;
			}
		}
		return found;
	}

	public int getLineNumberLocation(int lineNumber) {
		for (int i = 0; i < numEntries; i++) {
			if (tableEntries[i].getType() == LINE_NUMBER && tableEntries[i].getSymbol() == lineNumber) {
				return tableEntries[i].getLocation();
			}
		}
		return -1;
	}


	public void insertVariable(int symbol,int location) {
		TableEntry entry = new TableEntry(symbol, VARIABLE, location);
		tableEntries[numEntries] = entry;
		numEntries++;
	}

	public boolean hasVariable(int var) {
		boolean found = false;
		for (int i = 0; i < numEntries && !found; i++) {
			if (tableEntries[i].getType() == VARIABLE && tableEntries[i].getSymbol() == var) {
				found = true;
			}
		}
		return found;
	}

	public int getVariableLocation(int var) {
		for (int i = 0; i < numEntries; i++) {
			if (tableEntries[i].getType() == VARIABLE && tableEntries[i].getSymbol() == var) {
				return tableEntries[i].getLocation();
			}
		}
		return -1;
	}

	public void insertConstant(int symbol,int location) {
		TableEntry entry = new TableEntry(symbol, CONSTANT, location);
		tableEntries[numEntries] = entry;
		numEntries++;
	}

	public boolean hasConstant(int value) {
		boolean found = false;
		for (int i = 0; i < numEntries && !found; i++) {
			if (tableEntries[i].getType() == CONSTANT && tableEntries[i].getSymbol() == value) {
				found = true;
			}
		}
		return found;
	}

	public int getConstantLocation(int value) {
		for (int i = 0; i < numEntries; i++) {
			if (tableEntries[i].getType() == CONSTANT && tableEntries[i].getSymbol() == value) {
				return tableEntries[i].getLocation();
			}
		}
		return -1;
	}
	
	

	
	private TableEntry[] tableEntries;
	private int numEntries;


}

class TableEntry
{
	public TableEntry(int s, char t, int l) {
		symbol = s;
		type = t;
		location = l;
	}

	public int getSymbol() { return symbol; }
	public char getType() { return type; }
	public int getLocation() { return location; }

		private int symbol;
		private char type;
		private int location;
}

