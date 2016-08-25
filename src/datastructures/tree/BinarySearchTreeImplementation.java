package datastructures.tree;

public class BinarySearchTreeImplementation {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(0);
		bst.insert(1);
		bst.insert(2);
		bst.insert(-1);
		System.out.println(bst.find(-1));
	}

}
