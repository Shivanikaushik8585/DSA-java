package recursion;

public class Duplicate {
	public static void rem(String str,StringBuilder newstr,int idx,boolean map[]) {
		if(idx==str.length()) {
			System.out.print(newstr);
			return;
		}
		char ch=str.charAt(idx);
		if(map[ch-'a']==true) {
			rem(str,newstr,idx+1,map);
		}
		else {
			map[ch-'a']=true;
			rem(str,newstr.append(ch),idx+1,map);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="appnacollege";
rem(str,new StringBuilder(""),0,new boolean [26]);
	}

}
