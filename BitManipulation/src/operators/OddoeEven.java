package operators;

public class OddoeEven {
	public static void OddorEven(int n) {
		int bitmask=1;
		if((n & bitmask)==0) {
			System.out.print("odd");
			
		}
		else {
			System.out.print("even");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
OddorEven(n);
	}

}
