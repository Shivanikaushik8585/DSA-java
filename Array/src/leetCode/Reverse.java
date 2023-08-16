package leetCode;

public class Reverse {
	public static String rev(String str) {
		String str2="";
		for(int i=0;i<str.length();i++) {
			
			int n= str.length();
			char s = str.charAt(i);
			char t = str.charAt(n-i-1);
			char temp = s;
			s = t;
			t = temp;
		 str2+= s;
		 
			
			
		}
		return str2;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
	System.out.print(rev(str));
		

	}

}
