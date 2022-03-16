package recursion.commonQuestions;

//Program to calculate sum of first N natural numbers:
public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		System.out.println(findSum(5));
		
	}
	
	
	public static int findSum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n + findSum(n-1);
	}
	

}

//Theta(n) time complexity
//Theta(n) auxiliary space
