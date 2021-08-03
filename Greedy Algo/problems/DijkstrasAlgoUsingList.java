package problems;

import java.util.*;

public class DijkstrasAlgoUsingList {
	
	public void dijikstrasMST(List<List<Integer>> graph) {
		
		int V = graph.size();
		
		int min = 0;
		
	}
	
	public static void main(String[] args) {
		
		Integer[][] g = new Integer[][] { { 0, 4, 6, 0, 0, 0 }, { 4, 0, 6, 3, 4, 0 }, { 6, 6, 0, 1, 0, 0 },
			{ 0, 3, 1, 0, 2, 3 }, { 0, 4, 0, 2, 0, 7 }, { 0, 0, 0, 3, 7, 0 } };
			
		List<List<Integer>> graph = new ArrayList<>();
		
		for(Integer[] ints : g) {
			graph.add(Arrays.asList(ints));
		}
		
		
		
	}

}
