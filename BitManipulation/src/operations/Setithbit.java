package operations;

public class Setithbit {
	public static int set(int n,int i) {
		int bitmask=1<<i;
		return n|bitmask;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.print(set(n,2));

	}

}
