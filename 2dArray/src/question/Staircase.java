package question;

public class Staircase {
	public static boolean search(int matrix[][],int key) {
		int row=0; int col=matrix[0].length-1;
		while(row<matrix.length &&col>=0){
			if(matrix[row][col]==key) {
				System.out.print("key is found at"+row+" "+col);
				return true;
			}
			else if(key<matrix[row][col]) {
				col--;
			}
			else {
				row++;
			}
			
		}
		System.out.print("key is not found");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]={{10,20,30,40},{15,25,35,40},{27,29,37,46},{32,33,39,50}};
		int key=33;
		search(matrix,key);

	}

}
