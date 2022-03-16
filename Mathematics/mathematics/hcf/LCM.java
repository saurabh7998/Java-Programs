package mathematics.hcf;

public class LCM {
	public static void main(String[] args) {

		System.out.println(getLCM(100, 50));
	}

	public static int getHCF(int a, int b) {

		if (b == 0) {
			return a;
		}

		return getHCF(b, a % b);
	}
	
	public static int getLCM(int a, int b) {
		return (a*b)/getHCF(a, b);
	}

}
