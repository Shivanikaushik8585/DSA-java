package question;
import java.util.*;

public class Buyandsellingstock {
	public static int profitstock(int stocks[]) {
		int buyprice= Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<stocks.length;i++) {
			if(buyprice<stocks[i]) {
				maxprofit=Math.max(maxprofit, stocks[i]);
			}
			else {
				buyprice=stocks[i];
			}
		}
		return maxprofit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stocks[]= {7,1,5,3,6,4};
	System.out.print(	profitstock(stocks));

	}

}
