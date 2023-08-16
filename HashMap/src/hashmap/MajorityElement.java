package hashmap;

import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,5,3,1,5,3};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]+1));
			}
			else {
				map.put(arr[i],1);
			}
			
		}
		Set<Integer> keySet = map.keySet();
		for(Integer Key :keySet) {
			if(map.get(Key)> arr.length/3) {
				System.out.print(Key);
				
			}
		}

	}

}
