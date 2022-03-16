package mathematics.hcf;

public class HCF1 {
	
	public static void main (String[] args) {
		
		System.out.println(getHCF(100, 50));
	}
	
	
	public static int getHCF(int a , int b) {
		
		if(b==0) {
			return a;
		}
		
		return getHCF(b, a%b);
	}

}
