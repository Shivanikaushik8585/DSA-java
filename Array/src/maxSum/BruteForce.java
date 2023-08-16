package maxSum;
import java.util.*;

public class BruteForce {
	public static void maxsum(int num[]) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				currsum=0;
				for(int k=i;k<=j;k++) {
					currsum+=num[k];
					
					
				}
				System.out.println(currsum);
				if(maxsum<currsum) {
					maxsum=currsum;
				}
			}
		}
	System.out.print("max sum:"+maxsum);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,8,10};
		maxsum(num);

	}

}
