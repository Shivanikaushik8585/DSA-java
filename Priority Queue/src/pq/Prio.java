package pq;
import java.util.*;
public class Prio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq  = new PriorityQueue<>();
		pq.add(1);
		pq.add(4);
		pq.add(8);
		pq.add(3);
		
		while(!pq.isEmpty()) {
			System.out.print(pq.peek()+" ");;
			pq.remove();
		}
		

	}

}
