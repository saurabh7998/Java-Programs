package graph.implementation;

import java.util.ArrayList;

public class DFS {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited) 
	{ 
    	visited[s]=true;
        System.out.print(s +" ");
        
        for(int u:adj.get(s)){
            if(visited[u]==false)
                DFSRec(adj,u,visited);
        } 
	} 
	
	static void DFSearch(ArrayList<ArrayList<Integer>> adj, int V){
	    boolean[] visited=new boolean[V]; 
    	for(int i = 0; i<V; i++) 
    		visited[i] = false;
    		
        for(int i=0;i<V;i++){
            if(visited[i]==false)
                DFSRec(adj,i,visited);
        }
	}

	public static void main(String[] args) 
	{  
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

		
		System.out.println("Following is Depth First Traversal for disconnected graphs: "); 
	    DFSearch(adj,V);
	} 

}
