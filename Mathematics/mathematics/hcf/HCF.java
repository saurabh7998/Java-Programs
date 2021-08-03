package mathematics.hcf;

public class HCF {
	
	public static void main(String[] args) {
		System.out.println(getHCF(4, 10));  // HCF of 4 and 10 is 2
		System.out.println(getHCF(100, 50));
		
	}
	
	
	public static int getHCF(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		return a;
		//or return b; 
	}
}
