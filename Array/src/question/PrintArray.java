package question;

public class PrintArray {
public static void print(int num[]) {
	for(int i=0;i<num.length;i++) {
		int curr= num[i];
		for(int j=i+1;j<num.length;j++) {
			System.out.print("("+curr+","+num[j]+")");
		}
		System.out.println();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,8,10};
		print(num);

	}

}
