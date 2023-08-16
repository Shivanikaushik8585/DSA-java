package question;

public class subString {
public static String substr(String str,int si,int ei) {
	String sb=" ";
	for(int i=si;i<ei;i++) {
		sb+= str.charAt(i);
	}
	return sb;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="shivani";
System.out.print(substr(str,0,4));
	}

}
