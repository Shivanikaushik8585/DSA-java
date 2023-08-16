package backtracking;

public class Quene {
	public static boolean issafe(char board[][],int row,int col) {
//		vertical up
		for(int i=row-1;i>=0;i--) {
			if(board[i][col]=='Q') {
				return false;
			}
		}
//		diag up
		for(int i=row-1,  j=col-1;i>=0 && j>=0;i--,j--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
			
			for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
				if(board[i][j]=='Q') {
					return false;
				}
				
			}
			
		return true;
	}
	public static void nQue(char board[][],int row) {
		if(row== board.length) {
			print(board);
			return;
		}
		
		
		for(int j=0;j<board.length;j++) {
			if(issafe(board,row,j)) {
			board[row][j]='Q';
			nQue(board,row+1);
			board[row][j]='x';
		}
		}
	}
public static void print(char board[][]) {
	System.out.println("---cheseboard---");
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board.length;j++) {
			System.out.print(board[i][j]+" ");
		}
		System.out.println();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		char board[][] = new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='x';
			}
		}
 nQue(board,0);
	}

}
