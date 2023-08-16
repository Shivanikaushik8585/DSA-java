package arraylist;
import java.util.ArrayList;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		int element =list.get(2);
		System.out.println(element);
		
	list.remove(2);
	System.out.println(list);
	list.set(2,10);
	System.out.println(list);
	System.out.println(list.contains(1));
	System.out.print(list.contains(21));

	}

}
