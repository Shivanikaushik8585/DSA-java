package sorting;

public class Selectionsort {
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minpostion=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minpostion]>arr[j]) {
					minpostion=j;
				}
			}
			int temp=arr[minpostion];
			arr[minpostion]=arr[i];
			arr[i]=temp;
		}
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,2,1};
		sort(arr);
		print(arr);

	}

}
