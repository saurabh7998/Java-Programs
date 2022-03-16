package array.matrix.transposeOfMatrix;

public class PrintTranspose {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printTranspose(arr);
	}
	
	
	public static void printTranspose(int[][] arr) {
		
		int[][] temp = new int[arr.length][arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				temp[i][j] = arr[j][i];
			}
		}
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				System.out.print(temp[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}

}
