package recursion;

public class Pairing {
	public static int pair(int n) {
		if(n==1||n==2) {
			return n;
		}
		return pair(n-1)+(n-1)*pair(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(pair(3));

	}

}
