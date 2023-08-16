package Assignment;
import java.util.*;
public class Buyindstocks {
	public static int stocks(int prices[]) {
		int bs= Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<prices.length;i++) {
 if(bs<prices[i]) {
	int  profit= prices[i]-bs;
	maxprofit=Math.max(maxprofit, profit);
	 
 }
 else {
	 bs=prices[i];
 }
		}
		return maxprofit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int prices[]= {7,1,5,3,6,4};
		int prices[]= {7,6,4,3,1};
		System.out.print(stocks(prices));

	}

}
