package recursion;

public class Powerofx {
public static int pow(int x,int n) {
	if(n==0) {
		return 1;
	}
	return x*pow(x,n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(pow(2,10));
	}

}
