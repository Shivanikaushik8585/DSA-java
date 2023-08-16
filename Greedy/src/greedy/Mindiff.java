package greedy;
import java.util.*;

public class Mindiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3};
		int B[]= {2,1,3};
		Arrays.sort(A);
		Arrays.sort(B);
		int mxd =0;
		for(int i=0;i<A.length;i++) {
			mxd+=Math.abs(A[i]-B[i]);
			
			
			
		}
		System.out.print("max diff of the pairs:"+ mxd );
	

	}

}
