package greedy;

import java.util.ArrayList;

public class ActivitySelection {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[] = {1,3,0,5,8,5};
		int end[]= {2,4,6,7,9,9};
		int max=0;
		ArrayList<Integer> ans = new ArrayList<>();
		max =1;
		ans.add(0);
		int le =end[0];
		for(int i=1;i<end.length;i++) {
			if(start[i]>=le) {
				max++;
				ans.add(i);
			}
			
		}
		System.out.println(max);
		for(int i=0;i<ans.size();i++) {
			System.out.println("A" +ans.get(i)+" ");
			
		}
		System.out.println();
		
		

	}

}
