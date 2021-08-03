package graph.implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopoSort {
	
	public static void main(String[] args) {
		
		int V = 6;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0; i<V; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 1);
		addEdge(graph, 4, 0);
		addEdge(graph, 4, 1);
		addEdge(graph, 5, 0);
		addEdge(graph,5,2);
		
		//printGraph(graph, V);
		
		System.out.println("DFS");
		DFS(graph,V);
		System.out.println("\nBFS:");
		BFS(graph,V);
		System.out.println("\nTopological Sort:");
		TopologicalSort(graph, V);
		
	}
	
	public static void TSort(ArrayList<ArrayList<Integer>> graph, boolean[] visited, Stack<Integer> stack,int i) {
		
		visited[i] = true;
		
		
		
		for(int u:graph.get(i)) {
			if(visited[i]==false) {
				TSort(graph,visited,stack,u);
			}
		}
		
		stack.push(i);
	}
	
	public static void TopologicalSort(ArrayList<ArrayList<Integer>> graph, int V) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<V; i++) {
			if(visited[i]==false) {
				TSort(graph, visited, stack, i);
			}
		}
		
		while(stack.isEmpty()==false) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	public static void BFSearch(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int s) {
			
		Queue<Integer> q = new LinkedList<Integer>();

		visited[s] = true;
		q.add(s);

		while (q.isEmpty() == false) {
			int u = q.poll();
			System.out.print(u + " ");

			for (int v : graph.get(u)) {
				if (visited[v] == false) {
					visited[v] = true;
					q.add(v);
				}
			}
		}
	}
	
	public static void BFS(ArrayList<ArrayList<Integer>> graph, int V) {
		boolean visited[] = new boolean[V];
		
		for(int i=0; i<V; i++) {
			if(visited[i]==false) {
				BFSearch(graph, visited, i);
			}
		}
	}
	
	public static void DFSRec(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int i) {
		
		visited[i] = true;
		System.out.print(i+" ");
		
		for(int u:graph.get(i)) {
			if(visited[u]==false) {
				DFSRec(graph, visited,u);
			}
		}
	}
	
	public static void DFS(ArrayList<ArrayList<Integer>> graph, int V) {
		
		boolean[] visited = new boolean[V];
		for(int i=0; i<V; i++) {
			visited[i] = false;
		}
		
		for(int i=0; i<V; i++) {
			if(visited[i]==false) {
				DFSRec(graph, visited, i);
			}
		}
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>> graph, int V) {
		for(int i=0; i<V; i++) {
			System.out.println(i+" "+graph.get(i).toString());
		}
	}
	
	public static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
		graph.get(u).add(v);
	}

}
