package dp;

public class Knapsack {
	public static int knap(int val[],int w[],int v,int n) {
		if(v==0|| n==0) {
			return 0;
		}
		if(w[n-1]<=v) {
			int ans1 = val[n-1]+knap(val,w,v-w[n-1],n-1);
			int ans2 = knap(val,w,v,n-1);
			return Math.max(ans1, ans2);
			
		}
		else {
			return knap(val,w,v,n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[]= {15,14,10,45,30};
		int w[]= {2,5,1,3,4};
		int v=7;
		System.out.print(knap(val,w,v,val.length));

	}

}
