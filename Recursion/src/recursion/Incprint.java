package recursion;

public class Incprint {
	public static void print(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return ;
		}
		print(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n);

	}

}
