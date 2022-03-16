package graph.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUnweightedGraph {

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static void getShortestPaths(ArrayList<ArrayList<Integer>> adj, int V, int s, int[] distance) {

		boolean[] visited = new boolean[V];
		for (int i = 0; i < V; i++) {
			visited[i] = false;
		}

		Queue<Integer> q = new LinkedList<Integer>();

		visited[s] = true;
		
		q.add(s);

		while (q.isEmpty() == false) {
			int u = q.poll();
			for (int v : adj.get(u)) {
				if (visited[v] == false) {
					visited[v] = true;
					distance[v] = distance[u] + 1;
					q.add(v);
				}
			}
		}

	}

	public static void main(String[] args) {

		int V = 4;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0,1); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);
        
    	int[] dist=new int[V];
        
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        
        dist[0]=0;
        getShortestPaths(adj,V,0,dist); 
        
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }

	}

}
