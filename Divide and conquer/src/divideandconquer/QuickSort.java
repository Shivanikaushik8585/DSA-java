package divideandconquer;

public class QuickSort {
public static void qs(int arr[],int si,int ei ) {
	if(si>=ei) {
		return;
	}
	int ix=par(arr,si,ei);
	qs(arr,si,ix-1);
	qs(arr,ix+1,ei);
}
public static int par(int arr[],int si,int ei) {
	int piviot= arr[ei];
	int i=si-1;
	for(int j=si;j<ei;j++) {
		if(arr[j]<=piviot) {
			i++;
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
		}
	}
	i++;
	int temp=piviot;
	arr[ei]=arr[i];
	arr[i]=temp;
	return i;
}
public static void print(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,4,1,7};
		qs(arr,0,arr.length-1);
		print(arr);
		

	}

}
