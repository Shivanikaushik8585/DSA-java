package assignment;

public class PrintNum {
	public static int src(int num[][],int key) {
		int count=0;
	for(int i=0;i<num.length;i++) {
		for(int j=0;j<num[0].length;j++) {
			if(num[i][j]==key) {
				count++;
			}
			
		}
	}
	return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]= {{4,7,8},{8,8,7}};
		int key=7;
		System.out.print(src(num,key));

	}

}
