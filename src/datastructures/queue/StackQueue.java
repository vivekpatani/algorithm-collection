package datastructures.queue;

import java.util.Stack;

/**
 * A Queue made out of two stacks. Chapter 3 Q 5
 * 
 * @author flipswitch
 *
 * @param <E>
 */
public class StackQueue<E> {

	private Stack<E> newest;
	private Stack<E> oldest;

	public StackQueue() {
		newest = new Stack<>();
		oldest = new Stack<>();
	}

	public boolean push(E data) {
		newest.push(data);
		return true;
	}
	
	public void shiftStacks () {
		if (oldest.isEmpty()) {
			while (!newest.isEmpty())
				oldest.push(newest.pop());
		}
	}
	
	public E pop () {
		shiftStacks();
		return oldest.pop();
	}
	
	public E peek () {
		shiftStacks();
		return oldest.peek();
	}

	public int size() {
		return newest.size() + oldest.size();
	}
}
