package oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fish Shark=new fish();
//		Shark.eat();
Dog dobby= new Dog();
dobby.eat();
dobby.legs=4;
System.out.println(dobby.legs);

	}

}
class Animal {
	String color;
	void eat() {
		System.out.println("eats");
	}
	void breathe() {
		System.out.println("breathe");
	}
	
}
//class fish extends Animal{
//	int fins;
//	void swin(){
//		System.out.println("swin in Water");
//	}
//	
//}

class Mammel extends Animal{
	int legs;
}
class Dog extends Mammel{
	String breed;
}