package maxSum;
import java.util.*;

public class Kadanes_Algorithm {
	public static void maxsum(int num[]) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			currsum+=num[i];
			if(currsum<0) {
				currsum=0;
				
			}
			maxsum= Math.max(maxsum, currsum);
			
		}
		System.out.print("max value:"+maxsum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {-2,-3,4,-1,-2,1,5,-3};
maxsum(num);
	}

}
