package advancepattern;

public class Number_Pyramide {
	public static void num(int n) {
		for(int i=1;i<=n;i++) {
//			for spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
//			print number
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
num(5);
	}

}
