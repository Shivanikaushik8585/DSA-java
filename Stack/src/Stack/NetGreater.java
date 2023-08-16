package Stack;
import java.util.*;

public class NetGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,8,0,1,3};
		Stack<Integer> s = new Stack<>();
		int gr[]= new int[arr.length];
		for(int i =arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				gr[i]=-1;
			}
			else {
				gr[i]=arr[s.peek()];
			}
			s.push(i);
		}
		for(int i=0;i<gr.length;i++) {
			System.out.print(gr[i]+" ");
		}
		System.out.println();

	}

}
