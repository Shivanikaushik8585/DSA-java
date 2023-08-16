package question;

public class clearrangepfBits {
	public static int range(int n,int i,int j) {
		int a=(~0)<<j+1;
		int b=(1<<i)-1;
		int bitmask= a|b;
		return  n & bitmask ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(range(10,2,4));

	}

}
