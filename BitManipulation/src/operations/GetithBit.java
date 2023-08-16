package operations;

public class GetithBit {
	public static int get(int n,int i) {
		int bitmask=1<<i;
		if((n & bitmask)==0) {
			return 0;
			
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.print(get(n,2));

	}

}
