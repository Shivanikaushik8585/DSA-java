package question;
import java.util.*;

public class Largest {
	public static int getLargest(int num[]) {
		int largest =Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(largest<num[i]) {
			largest= num[i];
			}
			if(smallest >num[i]) {
				smallest= num[i];
			}
		}
		System.out.println("smallest number:"+ smallest);
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,40,6,18,52,14};
		int largest= getLargest(num);
		System.out.print( "largest:"+largest);

	}

}
