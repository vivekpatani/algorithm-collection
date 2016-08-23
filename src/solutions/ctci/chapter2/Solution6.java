package solutions.ctci.chapter2;

import datastructures.queue.CircularQueue;

public class Solution6 {

	public static void main(String[] args) {
		
		CircularQueue<Integer> queue = new CircularQueue<>();
		queue.enQueue(0);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
