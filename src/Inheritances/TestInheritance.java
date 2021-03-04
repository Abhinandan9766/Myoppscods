package Inheritances;

public class TestInheritance {

	public static void main(String[] args) {
		
		//Compile time polymorphism
		Bmw b=new Bmw();
		b.Start();
		b.stop();
		b.Refule();
		b.safety();
//int m=b.a;
System.out.println(Car.a);

		System.out.println(".........");
		
		
		//Run time polymorphism
		
	       Car c= new Bmw();
	       c.Start();
	       c.stop();
	       c.Refule();
	}
	

}
