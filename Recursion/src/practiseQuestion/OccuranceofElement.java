package practiseQuestion;

public class OccuranceofElement {
	public static void occ(int arr[],int key,int idx) {
		if(idx==arr.length) {
			return;
		}
		if(arr[idx]==key) {
			System.out.println(idx);
		}
		occ(arr,key,idx+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,4,5,6,2,7,2,2};
		occ(arr,2,0);

	}

}
