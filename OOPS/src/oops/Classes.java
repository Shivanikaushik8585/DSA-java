package oops;

public class Classes{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pen p1 =new Pen();
		p1.SetColour("blue");
		System.out.println(p1.color);
		p1.SetTip(5);
		System.out.print(p1.Tip);
		
	}
}
class Pen{
		String color;
		int Tip;
		
	
	void SetColour(String newcolor) {
		color= newcolor;
	}
	void SetTip(int newTip) {
		Tip= newTip;
	}
	}

	class Student{
		String name;
		int grade;
		int Percentage;
		void percentage(int Phy,int Chem,int Math) {
			Percentage=((Phy+Chem+Math)/3);
		}
	}
	
	





