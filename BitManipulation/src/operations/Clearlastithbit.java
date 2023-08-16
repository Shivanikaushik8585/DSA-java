package operations;

public class Clearlastithbit {
	public static int clear(int n,int i) {
		int bitmask=(~0)<<i;
		return n & bitmask;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.print(clear(n,2));
		

	}

}
