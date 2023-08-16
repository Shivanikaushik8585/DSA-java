package oops;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h= new Horse();
		h.eat();
		h.walk();
		chicken c = new chicken();
		c.eat();
		c.walk();

	}

}
abstract class Animals{
	void eat() {
		System.out.println("eats");
	}
	abstract void walk();
}
class Horse extends Animals{
	 void walk(){
		 System.out.println("walk in four leg");
		
	}
}
class chicken extends Animals{
	void walk() {
		System.out.println("walk in 2 leg");
	}
}
