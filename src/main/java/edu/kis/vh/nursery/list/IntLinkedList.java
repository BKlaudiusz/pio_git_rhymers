package edu.kis.vh.nursery.list;

/**
 *  Default clas
 */
public class IntLinkedList {
	/**
	 * const variable to return
	 */
	private static final int RETURN_EMPTY = -1;
	/**
	 * Last node
	 */
	private Node last;

	/**
	 * Metohd to push to list
	 * @param i value element to push
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * method to check list is empty
	 * @return true is not empty
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * method to check list is full
	 * @return false is not full
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * get last value from list
	 * @return last input value
	 */
	public int top() {
		if (isEmpty())
			return RETURN_EMPTY;
		return last.value;
	}

	/**
	 * get last value and remove from list
	 * @return
	 */
	public int pop() {
		if (isEmpty())
			return RETURN_EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	/**
	 * private class in IntLinkedList
	 */
	private class Node {

		/**
		 * value node
		 */
		protected final int value;
		/**
		 * neighbour
		 */
		protected Node prev, next;

		/**
		 * set value node
		 * @param i value
		 */
		protected Node(int i) {
			value = i;
		}

	}
}
