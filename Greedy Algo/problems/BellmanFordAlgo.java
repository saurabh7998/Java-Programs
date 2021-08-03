package problems;

import java.util.ArrayList;

import java.util.List;


public class BellmanFordAlgo {

	private int dist[];
	// private Set<Integer> settled;
	// private PriorityQueue<Node> pq;
	private int V; // Number of vertices
	List<List<Node>> adj;

	public BellmanFordAlgo(int V) {
		this.V = V;
		dist = new int[V];
	}
	
	public void printMST(int[]dist) {
		System.out.println("Vertex"+"\t Source");
		for(int i=0; i<V-1; i++) {
			System.out.println(i + "\t" + dist[i]);
		}
	}
	
	public void bellmanFord(List<List<Node>> adj, int source) {
		
		this.adj = adj;

		for (int i = 0; i < V; i++)
			dist[i] = Integer.MAX_VALUE;
		
		dist[source] = 0;
		
		for(int count=0; count<V-1; count++) {
			
			for(int i=0; i<adj.get(count).size(); i++) {
				Node v = adj.get(count).get(i);
				if(dist[v.node]>dist[count]+v.cost) {
					dist[v.node] = dist[count]+v.cost;
					//System.out.println(dist[i]);
				}
			}
		}
		
		printMST(dist);

	}

	public static void main(String[] args) {
		int V = 5;
		int source = 0;

		// Adjacency list representation of the
		// connected edges
		List<List<Node>> adj = new ArrayList<List<Node>>();

		// Initialize list for every node
		for (int i = 0; i < V; i++) {
			List<Node> item = new ArrayList<Node>();
			adj.add(item);
		}
		
//		adj.get(0).add(new Node(0,0));
//		adj.get(1).add(new Node(0,0));
//		adj.get(2).add(new Node(0,0));
//		adj.get(3).add(new Node(0,0));
//		adj.get(4).add(new Node(0,0));



		adj.get(0).add(new Node(1,1));
		adj.get(0).add(new Node(2,4));
		
		adj.get(1).add(new Node(2,-3));
		adj.get(1).add(new Node(3,2));
		
		adj.get(2).add(new Node(3,3));
		
		BellmanFordAlgo b = new BellmanFordAlgo(V);
		
		b.bellmanFord(adj, source);

	}
	
	static class Node {
		public int node;
		public int cost;

		public Node() {
		}

		public Node(int node, int cost) {
			this.node = node;
			this.cost = cost;
		}

	}

}


