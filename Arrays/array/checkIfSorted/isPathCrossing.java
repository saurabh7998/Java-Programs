package array.checkIfSorted;

public class isPathCrossing {
	 
	
	public static void main(String[] args) {
		String s = "NESWW";
		System.out.println(isPathCrossing(s));
	}
	
	public static boolean isPathCrossing(String path) {
		int i=0, j=0;
		
		for(int k=0; k<path.length(); k++) {
			if(path.charAt(k)=='N') {
				j=j+1;
			}
			 if(path.charAt(k)=='S') {
				j=j-1;
			}
			 if(path.charAt(k)=='E') {
				i=i+1;
			}
			 if(path.charAt(k)=='W') {
				i=i-1;
			}
			
			
		}
		
		if(i<=0 && j<=0) {
			return true;
		}
		return false;
	}

}
