package datastructures.tree;

public class BinarySearchTreeImplementation {

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
		System.out.println(bst.find(15));
		bst.display();
		System.out.println();
		bst.postOrderTraversal(bst.getRoot());
		bst.levelOrderTraversal();
	}

}
