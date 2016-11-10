package datastructures.queue;

public class DequeueImplementation {

	public static void main(String[] args) {
		
		Dequeue<String> dequeue = new Dequeue<String>();
		
		dequeue.addAtBegining("D");
		dequeue.addAtEnd("E");
		dequeue.addAtBegining("C");
		dequeue.addAtBegining("B");
		dequeue.addAtBegining("A");
		
		dequeue.printForward();
		
		dequeue.pop();
		dequeue.printForward();
		
		dequeue.removeFirst();
		dequeue.printForward();

	}

}
