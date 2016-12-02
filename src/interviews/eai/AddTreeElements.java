package interviews.eai;

import java.util.ArrayList;
import java.util.List;

import datastructures.tree.BinarySearchTree;
import datastructures.tree.Node;;

public class AddTreeElements {

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.insert(8);
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(4);
		bst.insert(5);
		bst.insert(2);
		bst.insert(3);
		bst.insert(1);
		bst.insert(9);
		bst.insert(11);
		preOrderTraversal(bst.getRoot());
		System.out.println();
		inOrderTraversal(bst.getRoot());
		System.out.println();
		postOrderTraversal(bst.getRoot());
		System.out.println();
		System.out.println(sumOfTree(bst.getRoot()));
		System.out.println();
		System.out.println(sumOfTreeIteratively(bst.getRoot()));
	}

	public static void preOrderTraversal(Node<Integer> root) {

		if (root != null) {

			System.out.print(root.getData() + " ");
			preOrderTraversal(root.getLeftChild());
			preOrderTraversal(root.getRightChild());
		}
	}

	public static void inOrderTraversal(Node<Integer> root) {

		if (root != null) {

			inOrderTraversal(root.getLeftChild());
			System.out.print(root.getData() + " ");
			inOrderTraversal(root.getRightChild());
		}
	}

	public static void postOrderTraversal(Node<Integer> root) {

		if (root != null) {

			preOrderTraversal(root.getLeftChild());
			preOrderTraversal(root.getRightChild());
			System.out.print(root.getData() + " ");
		}
	}

	public static int sumOfTree(Node<Integer> root) {

		int sum, leftSum, rightSum;

		if (root == null) {
			sum = 0;
			return sum;
		}

		leftSum = sumOfTree(root.getLeftChild());
		rightSum = sumOfTree(root.getRightChild());

		sum = root.getData() + leftSum + rightSum;
		System.out.println(leftSum + " " + rightSum + " " + sum);
		return sum;
	}
	
	public static double sumOfTreeIteratively (Node<Integer> root) {
		
		double sum = 0.0;
		
		List<Node<Integer>> queue = new ArrayList<Node<Integer>>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Node<Integer> current = queue.get(0);
			queue.remove(0);
			sum += current.getData();
			
			if (current.getLeftChild() != null) queue.add(current.getLeftChild());
			if (current.getRightChild() != null) queue.add(current.getRightChild());
		}
		
		return sum;
	}
	
//	public static int heightOfTree (Node<Integer> root, int height) {
//		
//		if (root.getLeftChild() == null && root.getRightChild() == null) return height;
//		
//		
//	}
}
