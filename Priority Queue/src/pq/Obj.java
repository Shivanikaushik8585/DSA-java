package pq;
import java.util.*;
public class Obj {
	static class Student implements Comparable<Student>{
		String name;
		int rank;
		public Student(String name, int rank)  {
			this.name = name;
			this.rank = rank;
		}
		@Override
		public int compareTo (Student s2) {
			return this.rank-s2.rank;
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Student>pq = new PriorityQueue<>();
pq.add(new Student("A",2));
pq.add(new Student("B",78));
pq.add(new Student("C",12));
pq.add(new Student("D",8));
while(!pq.isEmpty()) {
	System.out.println(pq.peek().name+"->"+pq.peek().rank);
	pq.remove();
}

	}

}
