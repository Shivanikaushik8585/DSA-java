package greedy;
import java.util.*;

public class ChainLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
		Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
		int chainL =1;
		int chEnd= pairs[0][1];
		for(int i=1;i<pairs.length;i++) {
			if(pairs[i][0] > chEnd) {
				chainL++;
				chEnd =pairs[i][1];
			}
		}
		System.out.print(chainL);

	}

}
