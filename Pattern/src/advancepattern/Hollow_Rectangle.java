package advancepattern;

public class Hollow_Rectangle {
public static void hollow_rect(int totRows,int TotCol) {
// outer loop
	for(int i=1;i<=totRows;i++) {
//		inner loop
		for(int j=1;j<=TotCol;j++) {
//			boundary
			if(i==1||i==totRows|| j==1||j==TotCol) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hollow_rect(4,5);

	}

}
