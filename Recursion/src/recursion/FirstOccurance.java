package recursion;

public class FirstOccurance {
	public static int fstocc(int arr[],int key,int i) {
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return fstocc(arr,key,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,3,6,9,5,10,2,5,3};
		int key=5;
		System.out.print(fstocc(arr,key,0));

	}

}
