package question;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit[]= {"apple","banana","mango"};
		String largest= fruit[0];
		for(int i=1;i<fruit.length;i++) {
			if(largest.compareTo(fruit[i])<0) {
				largest= fruit[i];
			}
		}
System.out.print(largest);
	}

}
