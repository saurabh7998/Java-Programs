package problems;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {

	static class Pair {
		int deadline;
		int profit;

		Pair(int deadline, int profit) {
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	static class MyCmp implements Comparator<Pair> {

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO Auto-generated method stub
			return o2.profit - o1.profit; // To sort in decreasing order, we subtract first from second argument.
		}

	}

	public static void main(String[] args) {

		Pair[] arr = { new Pair(4, 50), new Pair(1, 5), new Pair(1, 20), new Pair(5, 10), new Pair(5, 80) };

		Arrays.sort(arr, new MyCmp());
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i].deadline);
			// System.out.println(arr[i].profit);
		}

		System.out.println("Max:" + max);

		//System.out.println(getMaxProfit(arr, max));
		System.out.println("Max Profit gained is: "+getMaxProfit(arr, max));

	}

	public static int getMaxProfit(Pair[] arr, int max) {

		Pair[] sol = new Pair[max];
		for(int i=0; i<sol.length; i++) {
//			sol[i].profit=0;
//			sol[i].deadline=0;
			sol[i]=null;
			
		}
		// sol[0] = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int k = arr[i].deadline - 1;
			while (k >= 0) {
				if (sol[k] == null) {
					sol[k] = arr[i];
//					sol[k].profit = arr[i].profit;
//					sol[k].deadline = arr[i].deadline;
					break;
				} else {
					k--;
				}
			}

		}
		
		int res = 0;
		for(int i=0; i<sol.length; i++) {
			if(sol[i]==null) {
				continue;
			}
			System.out.println(sol[i].profit);
			res += sol[i].profit;
		}

		
		return res;
		
		
	}
}
