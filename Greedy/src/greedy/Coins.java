package greedy;
import java.util.*;

import java.util.Arrays;
import java.util.Comparator;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer coins[] = {1,2,5,10,20,100,500,1000,2000};
		int amount=560;
		int countofCoin=0;
		Arrays.sort(coins,Comparator.reverseOrder());
		ArrayList<Integer>ans =new ArrayList<>();
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<=amount) {
				while(coins[i]<=amount) {
					countofCoin++;
					ans.add(coins[i]);
					amount-= coins[i];
					
				}
				
			}
		}
		System.out.println("min coins used :"+ countofCoin);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}

	}

}
