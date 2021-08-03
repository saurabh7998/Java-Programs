package graph.implementation;

import java.util.ArrayList;

public class UsingAdjacencyList {

	static class Graph {

		void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		void printGraph(ArrayList<ArrayList<Integer>> adj) {
			for (int i = 0; i < adj.size(); i++) {
				for (int j = 0; j < adj.get(i).size(); j++) {
					System.out.print(adj.get(i).get(j) + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int V = 4;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

		Graph g = new Graph();
		// Adding edges one by one
		g.addEdge(adj, 0, 1);
		g.addEdge(adj, 0, 2);
		g.addEdge(adj, 1, 2);
		g.addEdge(adj, 1, 3);

		g.printGraph(adj);
	}
}
