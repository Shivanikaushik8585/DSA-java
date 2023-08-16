package dp;

public class Lcs {
	public static int lcs(String str1, String str2,int n,int m) {
		if(n==0||m==0) {
			return 0;
		}
		if(str1.charAt(n-1)==str2.charAt(m-1)) {
			return lcs(str1,str2,n-1,m-1)+1;
		}
		else {
			int ans1 = lcs(str1,str2,n-1,m);
			int ans2 = lcs(str1,str2,n,m-1);
			return Math.max(ans1, ans2);
		}
	}
	public static int lcs2(String str1, String str2,int n,int m,int dp[][]) {
		if(n==0||m==0) {
			return 0;
		}
		if(dp[n][m]!=-1) {
//			System.out.print("hi");
			return dp[n][m];
			
		}
		if(str1.charAt(n-1)==str2.charAt(m-1)) {
			
			dp[n][m]=lcs2(str1,str2,n-1,m-1,dp)+1;
		return dp[n][m];
		}
		
		else {
			int ans1 = lcs2(str1,str2,n-1,m,dp);
			int ans2 = lcs2(str1,str2,n,m-1,dp);
			return dp[n][m]=Math.max(ans1, ans2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="abcde";
String str2 = "abc";
int n= str1.length();

int m = str2.length();
int dp[][]= new int[n+1][m+1];
for(int i=0;i<n+1;i++) {
	for(int j=0;j<m+1;j++) {
		dp[n][m]=-1;
	}
}
//System.out.print(lcs(str1,str2,str1.length(),str2.length()));
System.out.print(lcs2(str1,str2,n,m,dp));

	}

}
