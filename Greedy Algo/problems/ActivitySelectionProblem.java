package problems;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblem {

	static class Activity {
		int start;
		int finish;

		Activity(int s, int f) {
			start = s;
			finish = f;
		}
		
	}

	static class MyCmp implements Comparator<Activity> {

		@Override
		public int compare(Activity a1, Activity a2) {
			// TODO Auto-generated method stub
			return a1.finish - a2.finish; // Subtracting second from first argument sorts the items in ascending order
										
		}

	}

	public static void main(String[] args) {

		Activity[] arr = { new Activity(12, 25), new Activity(10, 20), new Activity(20, 30) };

		System.out.println(getMaxActivity(arr));

	}

	public static int getMaxActivity(Activity[] arr) {

		Arrays.sort(arr, new MyCmp());

		int res = 1;
		int prev = 0;

		for (int curr = 1; curr < arr.length; curr++) {

			if (arr[curr].start >= arr[prev].finish) {
				res++;

				prev = curr;
			}
		}

		return res;

	}

}
