package question;

public class Palidrome {
public static boolean palidrone(String str) {
	int n=str.length();
	for(int i=0;i<n/2;i++) {
		if(str.charAt(i)!=str.charAt(n-1-i)) {
			return false;
		}
		
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="racpacar";
	System.out.print(palidrone(str));

	}

}
