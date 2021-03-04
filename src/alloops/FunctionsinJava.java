package alloops;

public class FunctionsinJava {

	public static void main(String[] args) {
		
		FunctionsinJava obj=new FunctionsinJava();
		int z=obj.division(30,10);
		System.out.println(z);
		
		int e=obj.pqr();
      System.out.println("sum of a and b is" +e);
      
      obj.test();
      
      String l=obj.qa();
     
	}
	
	//1st method
public void test() {
	System.out.println("Test method");
}

//2nd method 

public int pqr(){
	
	int a=10;
	int b=20;
	int c=a+b;
	return c;
	
}

public String qa() {
	
	System.out.println("Usning string in 2nd method");
	
	String s="Selenium";
	return s;
			
}

public int division(int x,int y) {
	
	System.out.println("Division method");
     int d=x/y;
   return d;
}
}


