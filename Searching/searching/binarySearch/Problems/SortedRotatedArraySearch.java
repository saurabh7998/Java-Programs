package searching.binarySearch.Problems;

public class SortedRotatedArraySearch {
	
	public static void main(String[] args) {
		int[] arr = {100,200,300,20,30,40};
		int n = arr.length;
		int x = 200;
		System.out.println(search(arr,n,x));
	}
	
	
	static int search(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;
			if(arr[low] < arr[mid])
			{
				if(x >= arr[low] && x < arr[mid])
					high = mid - 1;
				else 
					low = mid + 1;
			}
			else
			{
				if(x > arr[mid] && x <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		

		return -1;
	}

}
