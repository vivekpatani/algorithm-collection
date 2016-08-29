package datastructures.tree;

public class TreeTraversalImplementation {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(10);
		bst.insert(8);
		bst.insert(12);
		bst.insert(6);
		bst.insert(9);
		bst.insert(5);
		bst.insert(7);
		bst.insert(11);
		bst.insert(14);
		bst.insert(13);
		bst.insert(15);
		
		System.out.println("Breadth First Traversal: ");
		long startTime = System.nanoTime();
		TreeTraversal.breadthFirstTraversal(bst);
		long endTime = System.nanoTime();
		System.out.println("Time (ms):" + (endTime-startTime)/1000000.0);
		
		System.out.println("Depth First Traversal: ");
		startTime = System.nanoTime();
		TreeTraversal.depthFirstTraversal(bst);
		endTime = System.nanoTime();
		System.out.println("Time (ms):" + (endTime-startTime)/1000000.0);
	}

}
