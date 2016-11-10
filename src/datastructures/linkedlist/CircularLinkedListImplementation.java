package datastructures.linkedlist;

public class CircularLinkedListImplementation {

	public static void main(String[] args) {
		
		CircularLinkedList<Integer> list = new CircularLinkedList<>();
		
		list.addAtBegining(3);
		list.addAtBegining(2);
		list.addAtBegining(1);
		list.addAtEnd(4);
		list.addAtEnd(6);
		list.addAtPosition(5, 5);
		list.addAtEnd(6);
		list.addAtEnd(6);
		list.addAtEnd(6);
		list.removeAllInstances(6);
		list.removeFirst();
		list.removeLast();
		list.removeAtPosition(1);
		list.printListForward();
		list.removeFirstInstance(3);
		list.printListForward();
		list.addAtBegining(0);
		list.printListForward();
	}

}
