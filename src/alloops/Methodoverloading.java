package alloops;

public class Methodoverloading {

	public static void main(String[] args) {
		

		Methodoverloading obj=new Methodoverloading();
		obj.test(10, 20);
		obj.test(10);
		obj.test();
int d=obj.main(50);	
System.out.println(d);
	
	
		
	}
	
	/***************************main method overloading
	 * @return *****************************************************/
	
	public static int main(int q) {
		System.out.println("Main method also overload by diff data type or parameter");
		return q;
		
	}
	
	
	
	/****************************non static method overloading********************************************/
	public void test() {
		
	System.out.println("Method with zero Parameter");
	
	}
    public void test(int a) {
	System.out.println("Method with one Parameter="+a);
}

    public void test(int x,int y) {
	
	System.out.println("Method with two Parameter="+(x+y));
}

}
