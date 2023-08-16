package Assignment;

public class Distint {
	public static boolean distinct(int num[]) {
	int arr[]=new int [num.length];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]==num[j]) {
					return true;
				}
			}
			
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,1};
	System.out.print(	distinct(num));
		

	}

}
