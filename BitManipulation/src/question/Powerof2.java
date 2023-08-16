package question;

public class Powerof2 {
	public static boolean  power(int n) {
		return (n & n-1)==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(power(4));
	}

}
