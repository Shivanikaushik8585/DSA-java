package Assignment;

public class Target {
	public static int target(int num[],int target) {
		for(int i=0;i<num.length;i++) {
			if(num[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num[]= {4,5,6,7,0,1,2};
		int num[]= {4,5,6,7,0,1,2};
		System.out.print(target(num,3));

	}

}
