package problems;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimsAlgoUsingList {

	public int minKey(int[] key, Boolean[] mstSet) {

		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < key.length; v++)
			if (mstSet[v] == false && key[v] < min) {
				min = key[v];
				min_index = v;
			}

		return min_index;
	}

	public void printMST(List<List<Integer>> graph, int[] parent) {

		// ArrayList<ArrayList<Integer>> mst = new ArrayList<>();

		System.out.println("Edge" + "\tWeight");
		for (int i = 1; i < graph.size(); i++) {
			System.out.println(parent[i] + "--" + i + "\t" + graph.get(i).get(parent[i]));
		}
	}

	public void primMST(List<List<Integer>> graph) {

		int V = graph.size();
		int[] key = new int[V];
		Boolean[] mstSet = new Boolean[V];
		int[] parent = new int[V];

		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}

		key[0] = 0;
		parent[0] = -1;
		

		for (int count = 0; count < graph.size() - 1; count++) {

			int u = minKey(key, mstSet);
			
			mstSet[u] = true;

			for (int v = 0; v < V; v++)

				// graph[u][v] is non zero only for adjacent vertices of m
				// mstSet[v] is false for vertices not yet included in MST
				// Update the key only if graph[u][v] is smaller than key[v]
				if (graph.get(u).get(v) != 0 && mstSet[v] == false && graph.get(u).get(v) < key[v]) {
					parent[v] = u;
					key[v] = graph.get(u).get(v);
				}

		}

		printMST(graph, parent);

	}

	public static void main(String[] args) {

		/*
		 * ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		 * 
		 * for (int i = 0; i < V; i++) { graph.add(new ArrayList<Integer>()); }
		 */

		Integer g[][] = new Integer[][] { { 0, 4, 6, 0, 0, 0 }, { 4, 0, 6, 3, 4, 0 }, { 6, 6, 0, 1, 0, 0 },
				{ 0, 3, 1, 0, 2, 3 }, { 0, 4, 0, 2, 0, 7 }, { 0, 0, 0, 3, 7, 0 } };

		List<List<Integer>> lists = new ArrayList<>();
		for (Integer[] ints : g) {
			lists.add(Arrays.asList(ints));
		}

		//System.out.println("Hi" + lists.get(1).get(2));

		// graph = {{1,2},{2,3}};
		/*
		 * graph.get(0).add(1); graph.get(0).add(7);
		 * 
		 * graph.get(1).add(0); graph.get(1).add(7); graph.get(1).add(2);
		 * 
		 * graph.get(2).add(1); graph.get(2).add(8); graph.get(2).add(5);
		 * graph.get(2).add(3);
		 * 
		 * graph.get(3).add(2); graph.get(3).add(5); graph.get(3).add(4);
		 * 
		 * graph.get(4).add(3); graph.get(4).add(5);
		 * 
		 * graph.get(5).add(6); graph.get(5).add(2); graph.get(5).add(3);
		 * graph.get(5).add(4);
		 * 
		 * graph.get(6).add(7); graph.get(6).add(8); graph.get(6).add(5);
		 * 
		 * graph.get(7).add(0); graph.get(7).add(1); graph.get(7).add(8);
		 * graph.get(7).add(6);
		 * 
		 * graph.get(8).add(2); graph.get(8).add(7); graph.get(8).add(6);
		 */
		PrimsAlgoUsingList pm = new PrimsAlgoUsingList();
		pm.primMST(lists);
	}

}
