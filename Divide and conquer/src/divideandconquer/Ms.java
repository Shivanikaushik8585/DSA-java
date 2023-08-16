package divideandconquer;

public class Ms {
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void me(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		me(arr,si,mid);
		me(arr,mid+1,ei);
		sort(arr,si,mid,ei);
	}
	public static void sort(int arr[],int si,int mid,int ei) {
		int temp[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]){
			temp[k]=arr[i];
			i++;
		}
			else {
				temp[k]=arr[j];
				j++;
			}
			k++;
			
	}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=ei) {
			temp[k++]=arr[j++];
		}
		for(k=0,i=si;k<temp.length;k++,i++) {
			arr[i]=temp[k];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,2,4,6};
		me(arr,0,arr.length-1);
		print(arr);

	}

}
