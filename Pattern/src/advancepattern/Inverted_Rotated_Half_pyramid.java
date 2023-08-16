package advancepattern;

public class Inverted_Rotated_Half_pyramid {
	public static void half_pyramid(int n) {
//		outer loop
		for(int i=1;i<=n;i++) {
//			spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
//			star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		half_pyramid(4);

	}

}
