package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.getLast();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.getLast();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.getLast();
		Assert.assertEquals(testValue, result);
		result = rhymer.getLast();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testHanoiCountIn(){
		DefaultCountingOutRhymer hanoiRhymer = new HanoiRhymer();

		int testValue = 15;
		hanoiRhymer.countIn(testValue);
		int result = hanoiRhymer.getLast();

		Assert.assertEquals(testValue,result);

		testValue = -9;
		hanoiRhymer.countIn(testValue);
		result = hanoiRhymer.getLast();

		Assert.assertEquals(testValue,result);

		testValue = 525;
		hanoiRhymer.countIn(testValue);
		result = hanoiRhymer.getLast();

		Assert.assertNotEquals(testValue,result);
	}
	@Test
	public void testFIFOCountOut(){
		DefaultCountingOutRhymer defaultCountingOutRhymer = new FIFORhymer();
		final int EXPECTVALUE = -1;

		int result = defaultCountingOutRhymer.countOut();
		Assert.assertEquals(result,EXPECTVALUE);

		int test = 1000;
		defaultCountingOutRhymer.countIn(1000);
		result = defaultCountingOutRhymer.countOut();
		Assert.assertEquals(result,test);
	}

}
