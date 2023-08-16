package search;

public class BinarySearch {
public static int binary_Search(int num[],int key) {
	int start=0;int end= num.length-1;
	int mid = (start+end)/2;
	while(start<=end) {
	if(num[mid]==key) {
		return mid;
	}
//	(right)
	if(num[mid]<key) {
		start=mid+1;
	}
//	left
	else {
		end=mid-1;
	}
		
}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,8,10,12,18};
		int key=8;
		System.out.println("key is found :"+binary_Search(num,key));

	}

}
