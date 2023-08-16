package recursion;

public class Tillingprob {
	public static int tilp(int n) {
		if(n==0||n==1) {
			return 1;
		}
//		horizontal?
		int fnm1= tilp(n-1);
//		vertically
		int fnm2= tilp(n-2);
		int totalways = fnm1+fnm2;
		return totalways;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(tilp(4));

	}

}
