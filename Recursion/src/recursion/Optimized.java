package recursion;

public class Optimized {
	public static int pow(int a,int n) {
		if(n==0) {
			return 1;
		}
		int psq= pow(a,n/2)*pow(a,n/2);
		if(n%2!=0) {
			psq=a*psq;
		}
		return psq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int n=10;
	System.out.print(pow(a,n));

	}

}
