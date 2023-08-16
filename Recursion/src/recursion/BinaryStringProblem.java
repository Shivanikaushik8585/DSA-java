package recursion;

public class BinaryStringProblem {
	public static void bin(int n,int lastdigit,StringBuilder str) {
		if(n==0) {
			System.out.println(str);
			return;
			
		}
		bin(n-1,0,str.append("0"));
		if(lastdigit==0) {
			bin(n-1,1,str.append("1"));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bin(3,0,new StringBuilder(""));

	}

}
