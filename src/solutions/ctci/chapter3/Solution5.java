package solutions.ctci.chapter3;

import datastructures.queue.StackQueue;

/**
 * Refer StackQueue in Datastrcutures.Queue Package for answer.
 * @author flipswitch
 *
 */
public class Solution5 {

	public static void main(String[] args) {
		
		StackQueue<Integer> queue = new StackQueue<>();
		
		queue.push(5);
		queue.push(4);
		queue.push(3);
		queue.push(2);
		queue.push(1);
		queue.push(0);
		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
	}

}
