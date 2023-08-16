package oops;

public class HierachalInhertiance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird ciya= new Bird();
		ciya.eat();

	}

}
class Animals{
	String color;
	void eat() {
		System.out.println("eat");
	}
	void brathe(){
		System.out.println("breate");
	}
}
class Fish extends Animals{
	void swim(){
		System.out.println("swim");
	}
	
	
}
class Mammels extends Animals{
	void walk() {
		System.out.print("walk");
	}
}
class Bird extends Animals{
	void fly() {
		System.out.println("fly");
	}
}
