package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INT = -1;
	public static final int INT1 = 12;

	private final int[] numbers = new int[INT1];

	public int[] getNumbers() {
		return numbers;
	}

	public int getTotal() {
		return total;
	}

	private int total = INT;
	
	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int getLast() {
		if (callCheck())
			return INT;
		return getNumbers()[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return getNumbers()[total--];
	}

}
