package operations;

public class Clearithbit {
	public static int clear(int n,int i) {
		int bitMask=~(1<<i);
		return n & bitMask;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
System.out.print(clear(10,1));
	}

}
