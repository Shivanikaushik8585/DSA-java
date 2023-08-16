package search;

public class Linear_search {
public static int LinearSearch(int num[],int key) {
	for(int i=0;i<num.length;i++) {
		if (num[i]==key) {
			return i;
		}
		
	}
	return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,10,12,14};
		int key=30;
		int index= LinearSearch(num,key);
		if(index==-1) {
			System.out.println("KEY IS not found");
		}
		else {
			System.out.print("key at index Number :"+ index);
		}

	}

}
