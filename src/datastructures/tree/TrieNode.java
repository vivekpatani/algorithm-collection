package datastructures.tree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

	Map<Character, TrieNode> children;
	private boolean endOfString;

	public TrieNode() {
		children = new HashMap<>();
		endOfString = false;
	}

	public boolean isEndOfString() {
		return endOfString;
	}

	public void setEndOfString(boolean endOfString) {
		this.endOfString = endOfString;
	}

}
