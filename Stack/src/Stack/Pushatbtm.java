package Stack;
import java.util.*;

public class Pushatbtm {
	public static void btm(Stack<Integer>s ,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		btm(s,data);
		s.push(top);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		btm(s ,4);
		while(s.isEmpty()) {
			System.out.print(s.peek());
			s.pop();
		}

	}

}
