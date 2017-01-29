package datastructures.tree;

public class Trie {

	private static TrieNode root;

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		root = new TrieNode();

		TrieNode root = insert("abc");
		root = insert("babc");
		root = insert("ab");
		System.out.println(root.children);
		display(root);
		System.out.println(searchPrefix("a"));
		System.out.println(searchWord("ab"));
	}

	/**
	 * The wrapper around the actual insert method
	 * 
	 * @param input
	 * @return
	 */
	public static TrieNode insert(String input) {

		if (root == null) {
			root = new TrieNode();
		}

		insert(input, root, 0);
		return root;
	}

	/**
	 * To add a string to the Trie Tree.
	 * 
	 * @param input
	 * @param root
	 * @param index
	 * @return
	 */
	private static TrieNode insert(String input, TrieNode root, int index) {

		// If the string has been completely added to Trie
		// Instead of adding something to it, indicate EOW
		if (index == input.length()) {
			root.setEndOfString(true);
			return root;
		}

		// If the character does not exist in the Trie,
		// Add it after making a new TrieNode for it
		if (!root.children.containsKey(input.charAt(index))) {
			TrieNode nextNode = new TrieNode();
			root.children.put(input.charAt(index), nextNode);
			return insert(input, nextNode, index + 1);
		} else {
			// Else character exists and just move on to next reference and
			// increment index
			return insert(input, root.children.get(input.charAt(index)), index + 1);
		}
	}

	/**
	 * Wrapper around Search Prefix
	 * 
	 * @param input
	 * @return
	 */
	private static boolean searchPrefix(String input) {
		return searchPrefix(input, root, 0);
	}

	/**
	 * Searching for a prefix in the Trie Tree.
	 * 
	 * @param input
	 * @param root
	 * @param index
	 * @return
	 */
	private static boolean searchPrefix(String input, TrieNode root, int index) {

		if (index == input.length())
			return true;

		// If the TrieNode did not contain the current character,
		// Return false;
		if (!root.children.containsKey(input.charAt(index))) {
			return false;
		} else {
			return searchPrefix(input, root.children.get(input.charAt(index)), index + 1);
		}
	}

	/**
	 * Wrapper around the Search Word
	 * 
	 * @param input
	 * @return
	 */
	private static boolean searchWord(String input) {
		return searchWord(input, root, 0);
	}

	private static boolean searchWord(String input, TrieNode root, int index) {
		
		System.out.println(root.children + " Is the End Near: " + root.isEndOfString());
		// If it indeed the end of String and the End of word
		if (input.length() == index) {
			System.out.println(index);
			return root.isEndOfString();
		}
		// If the TrieNode did not contain the current character,
		// Return false;
		if (!root.children.containsKey(input.charAt(index))) {
			return false;
		} else {
			return searchWord(input, root.children.get(input.charAt(index)), index + 1);
		}
	}

	/**
	 * To Display the Words in a Trie Tree
	 * 
	 * @param root
	 */
	private static void display(TrieNode root) {

		if (root.isEndOfString())
			System.out.println();

		for (char child : root.children.keySet()) {
			System.out.print(child);
			display(root.children.get(child));
		}
	}
}