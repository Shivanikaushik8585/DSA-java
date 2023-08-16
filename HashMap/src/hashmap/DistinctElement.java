package hashmap;
import java.util.*;

public class DistinctElement {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,6,1,7,3,4,2,1};
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
		}
		System.out.print(set.size());

	}

}
