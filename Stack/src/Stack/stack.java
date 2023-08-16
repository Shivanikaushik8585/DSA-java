package Stack;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		while(!s.isEmpty()) {
			System.out.print(s.peek() +" 0");
			s.pop();
		}

	}

}
