package graph.implementation;

import java.util.*;

public class BFS {

	public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {

		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	public static void BFSearch(ArrayList<ArrayList<Integer>> adjList, int s, boolean[] visited) {

		Queue<Integer> q = new LinkedList<Integer>();

		visited[s] = true;
		q.add(s);

		while (q.isEmpty() == false) {
			int u = q.poll();
			System.out.print(u + " ");

			for (int v : adjList.get(u)) {
				if (visited[v] == false) {
					visited[v] = true;
					q.add(v);
				}
			}
		}

	}

	static void BFSDin(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean[] visited = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;
		for (int i = 0; i < V; i++) {
			if (visited[i] == false)
				BFSearch(adj, i, visited);
		}
	}

	public static void main(String[] args) {
		int V = 7;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 2, 3);
		addEdge(adj, 1, 3);
		addEdge(adj, 4, 5);
		addEdge(adj, 5, 6);
		addEdge(adj, 4, 6);

		System.out.println("Following is Breadth First Traversal: ");
		BFSDin(adj, V);
	}

}
