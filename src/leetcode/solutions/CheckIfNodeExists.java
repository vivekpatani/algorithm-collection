package leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckIfNodeExists {

	private static class Graph {

		HashMap<Integer, List<Integer>> graph;

		public Graph() {
			graph = new HashMap<>();
		}

		public boolean addNode(int source, int destination) {

			if (graph.containsKey(source)) {
				graph.get(source).add(destination);
				return true;
			} else {
				// Don't know why this way does not work
				// graph.put(source, new ArrayList<Integer>(destination));
				graph.put(source, new ArrayList<Integer>());
				graph.get(source).add(destination);
				return true;
			}
		}

		public boolean ifPathExistsBFS(int source, int destination) {

			if (source == destination) {
				return true;
			}

			List<Integer> queue = new ArrayList<Integer>(graph.get(source));
			List<Integer> visited = new ArrayList<Integer>();

			while (!queue.isEmpty()) {
				int current = queue.remove(0);

				// If current Node is not visited, lets go ahead
				if (!visited.contains(current)) {

					// Add the node to the visited list now
					visited.add(current);

					// If the current node has neighbours add them too.
					if (graph.get(current) != null)
						queue.addAll(graph.get(current));
					if (current == destination) {
						return true;
					}
				}
			}

			return false;
		}

		public boolean ifPathExistsDFS(int source, int destination) {

			if (source == destination) {
				return true;
			}

			List<Integer> stack = new ArrayList<Integer>(graph.get(source));
			List<Integer> visited = new ArrayList<Integer>();

			while (!stack.isEmpty()) {
				
				// Just changed this for DFS
				int current = stack.remove(stack.size() - 1);

				// If current Node is not visited, lets go ahead
				if (!visited.contains(current)) {

					// Add the node to the visited list now
					visited.add(current);

					// If the current node has neighbours add them too.
					if (graph.get(current) != null)
						stack.addAll(graph.get(current));
					if (current == destination) {
						return true;
					}
				}
			}

			return false;
		}

	}

	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addNode(0, 1);
		graph.addNode(0, 2);
		graph.addNode(0, 3);

		graph.addNode(1, 4);

		graph.addNode(2, 5);

		graph.addNode(3, 6);

		graph.addNode(7, 8);

		long startTime = System.nanoTime();
		System.out.println(graph.ifPathExistsBFS(0, 7));
		long endTime = System.nanoTime();
		
		System.out.println((endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		System.out.println(graph.ifPathExistsDFS(0, 7));
		endTime = System.nanoTime();
		
		System.out.println((endTime - startTime) + " ns");
	}
}