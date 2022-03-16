package array.maxStockProfit;

public class GetMaxProfit {
	
	public static void main(String[] args) {
		
		int[] stockPrices = {1,5,3,8,12};
		/*
		 * Stock Prices:
		 * Day1 = 1
		 * Day2 = 5
		 * Day3 = 3
		 * Day4 = 8
		 * Day5 = 12
		 * 
		 * If we buy on Day1 and sell on Day2, we get profit of 4
		 * If we again buy on Day3 and sell on Day5, we get profit of 9
		 * So total net profit is 4+9 = 13
		*/
		
		System.out.println(getMaxProfit(stockPrices));
		
	}
	
	public static int getMaxProfit(int[] arr) {
		
		int profit = 0;
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]>arr[i-1]) {
				profit += arr[i]-arr[i-1];
			}
		}
		return profit;
	}

}
