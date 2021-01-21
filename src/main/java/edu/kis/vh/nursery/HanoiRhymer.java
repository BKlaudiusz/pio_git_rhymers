package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int INT = 0;
	private  int totalRejected = INT;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
	if (!callCheck() && in > getLast())
		totalRejected++;
	else
		super.countIn(in);
	}
}
