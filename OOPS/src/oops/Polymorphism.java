package oops;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator cal= new Calculator();
//		System.out.println(cal.sum(1,2));
////		System.out.println(cal.sum(1.2,2.4));
//		System.out.println(cal.sum(1,2,4));
		Deer d= new Deer();
		d.eat();
		
		

	}

}
class Calculator{
	int sum(int a,int b) {
		return a+b;
	}
	float sum(float a, float b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	
}
class Animals{
	void eat() {
		System.out.print("eat anything");
	}
}
class Deer{
	void eat() {
		System.out.print("eat grass");
	}
}