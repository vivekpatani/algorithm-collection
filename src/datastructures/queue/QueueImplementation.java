package datastructures.queue;

public class QueueImplementation {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enQueue(0);
		queue.enQueue(1);
		queue.enQueue(3);
		
		System.out.println(queue.getSize());
		queue.pop();
		System.out.println(queue.getSize());
		queue.destroy();
		System.out.println(queue.getSize());
		queue.pop();
		System.out.println(queue.getSize());
		

	}

}
