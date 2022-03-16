package arrray.findLeaders;

public class FindLeader {
	public static void main(String[] args) {
		
		int[] arr = {7,10,4,10,6,5,2};
		
		findLeaders(arr);
	
		
	}
	
	
	public static void findLeaders(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			boolean flag = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<=arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(arr[i]);
			}
		}
	}
}
