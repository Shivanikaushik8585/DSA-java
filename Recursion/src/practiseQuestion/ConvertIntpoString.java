package practiseQuestion;

public class ConvertIntpoString {
	public static void string(int n) {
		String digit[]= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		if(n==0) {
			return;
		}
		int lastdigit=n%10;
		string(n/10);
		System.out.println(digit[lastdigit]+" ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3434;
		string(n);

	}

}
