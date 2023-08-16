package recursion;

public class Issorted {
	public static boolean sort(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
			
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return sort(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.print(sort(arr,0));

	}

}
