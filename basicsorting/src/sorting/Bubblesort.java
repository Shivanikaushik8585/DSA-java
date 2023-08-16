package sorting;

public class Bubblesort {
	public static void sort(int arr[]) {
		for(int turn=0;turn<arr.length;turn++) {
			for(int j=0;j<arr.length-1-turn;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
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
		int arr[]= {5,3,4,1,2};
		sort(arr);
		print(arr);

	}

}
