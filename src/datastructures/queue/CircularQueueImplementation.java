package datastructures.queue;

public class CircularQueueImplementation {

	public static void main(String[] args) {
		
		CircularQueue<String> queue = new CircularQueue<String>();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		queue.printForward();
		
		queue.pop();
		queue.printForward();
		
		queue.enQueue("Z");
		
		queue.pop();
		queue.printForward();
		
		queue.pop();
		queue.printForward();
		
		queue.pop();
		queue.printForward();
		
		queue.pop();
		queue.printForward();
		
		queue.pop();
		queue.printForward();
	}

}
