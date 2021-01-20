package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ERRORRETURN = -1;
	public static final int SIZEARRAY = 12;
	private final int[] numbers = new int[SIZEARRAY];

	public int[] getNumbers() {
		return numbers;
	}

	public int getTotal() {
		return total;
	}

	private int total = ERRORRETURN;
	
	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	public boolean callCheck() {
		return total == ERRORRETURN;
	}

	public boolean isFull() {
		return total == SIZEARRAY-1;
	}

	protected int getLast() {
		if (callCheck())
			return ERRORRETURN;
		return getNumbers()[total];
	}

	public int countOut() {
		if (callCheck())
			return ERRORRETURN;
		return getNumbers()[total--];
	}

}
