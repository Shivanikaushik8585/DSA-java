package sorting;
import java.util.*;

public class Countingsort {
	public static void sort(int arr[]) {
		int largest= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest=Math.max(largest, arr[i]);
			
		}
		int count[]=new int[largest+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
			
		}
//		sorting
		int j=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				arr[i]=j;
				j++;
				count[i]--;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,6,6,7};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
