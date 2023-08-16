package sorting;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Collections;

public class Inbuiltsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {5,3,4,2,1};
//		Arrays.sort(arr);
//		Arrays.sort(arr,0,3);
		Integer arr[]= {2,3,5,1,4};
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
