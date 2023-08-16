package backtracking;

public class Subsets {
	public static void Find(String str,String ans,int i) {
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
//		yes choice
		Find(str,ans+str.charAt(i),i+1);
//		no choice
		Find(str,ans,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str ="abc";
	Find(str," ",0);

	}

}
