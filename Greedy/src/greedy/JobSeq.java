package greedy;
import java.util.*;
public class JobSeq {
	static class Job{
		int deadline;
		int profit;
		int Id;
		public Job(int i,int d,int p) {
			Id=i;
			d= deadline;
			profit=p;
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jobs[][]= {{4,20},{1,10},{1,40},{1,30}};
		ArrayList<Job> jbs =new ArrayList<>();
		for(int i=0;i<jobs.length;i++) {
	
	jbs.add(new Job (i,jobs[i][0],jobs[i][1]));
		}
		Collections.sort(jbs,(obj1,obj2) -> obj2.profit-obj1.profit);
		ArrayList<Integer> seq = new ArrayList<>();
		int time=0;
		for(int i=0;i<jbs.size();i++) {
			Job curr = jbs.get(i);
			if(curr.deadline > time) {
				seq.add(curr.Id);
			System.out.print(	time++);
				
			}
		}
		System.out.println(" seq size"+seq.size());
		for(int i=0;i<seq.size();i++) {
			System.out.print(seq.get(i)+" ");
		}

	}

}
