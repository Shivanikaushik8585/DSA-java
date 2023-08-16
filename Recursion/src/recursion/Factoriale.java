package recursion;

public class Factoriale {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int factnm1=fact(n-1);
		int fn=n*factnm1;
		return fn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(fact(5));

	}

}
