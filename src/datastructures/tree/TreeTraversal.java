package datastructures.tree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TreeTraversal {

	public static void depthFirstTraversal(BinarySearchTree<Integer> tree) {

		Node<Integer> currentNode = tree.getRoot();
		Stack<Node<Integer>> stack = new Stack<>();

		currentNode.setVisited(1);
		stack.push(currentNode);

		while (!stack.isEmpty()) {

			System.out.print(currentNode.getData() + " ");

			if (currentNode.getRightChild() != null && currentNode.getVisited() == 0) {
				stack.add(currentNode.getRightChild());
				currentNode.getRightChild().setVisited(1);
			}
			if (currentNode.getLeftChild() != null && currentNode.getVisited() == 0) {
				stack.add(currentNode.getLeftChild());
				currentNode.getLeftChild().setVisited(1);
			}

			currentNode = stack.pop();
		}
		System.out.println();

	}

	public static void breadthFirstTraversal(BinarySearchTree<Integer> tree) {

		Node<Integer> currentNode = tree.getRoot();

		Queue<Node<Integer>> queue = new ConcurrentLinkedQueue<>();
		queue.add(currentNode);
		while (!queue.isEmpty()) {

			currentNode = queue.remove();
			System.out.print(currentNode.getData() + " ");

			if (currentNode.getLeftChild() != null)
				queue.add(currentNode.getLeftChild());
			if (currentNode.getRightChild() != null)
				queue.add(currentNode.getRightChild());
		}
		System.out.println();
	}
}
