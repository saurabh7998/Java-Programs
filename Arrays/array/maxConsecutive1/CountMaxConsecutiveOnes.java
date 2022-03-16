package array.maxConsecutive1;

import java.util.*;
import java.io.*;
import java.lang.*;

public class CountMaxConsecutiveOnes {

	public static int maxConsecutiveOnes(int arr[], int n) {
		int res = 0;

		for (int i = 0; i < n; i++) {
			int curr = 0;

			for (int j = i; j < n; j++) {
				if (arr[j] == 1)
					curr++;
				else
					break;
			}

			res = Math.max(res, curr);
		}

		return res;
	}

	public static void main(String args[]) {
		int arr[] = { 0, 1, 1, 1, 0, 1, 1 }, n = 7;  // 3 consecutive 1s

		System.out.println(maxConsecutiveOnes(arr, n));

	}

}