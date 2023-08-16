package assignment;

public class Transpose {
	public static void trans(int matrix[][],int num[][]) {
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				num[j][i]=matrix[i][j];
			}
			
		}
	}
	public static void print(int num[][]) {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[0].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{2,3,7},{4,5,7}};
		int num[][]=new int[matrix[0].length][matrix.length];
		trans(matrix,num);
		print(num);
	
	

}
}
