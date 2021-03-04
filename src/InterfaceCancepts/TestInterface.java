package InterfaceCancepts;

public class TestInterface {

	public static void main(String[] args) {
		
		HSBCbank hs=new HSBCbank();
		
		hs.credit();
		hs.debit();
		hs.tranfar();
		hs.educationloan();
		hs.carloan();
		System.out.println(USBank.min_bal);
		System.out.println("..........");
		
		hs.mutalfund();
		System.out.println(BrazilBank.a);
		System.out.println("..........");
		int x=USBank.min_bal;
		int y=100;
		System.out.println("My bank balance is"+(x+y));
		
		
		System.out.println(".....Dynamic poly. method.....");
		
		USBank b= new HSBCbank();
		b.credit();
		b.debit();
		b.tranfar();
		

	}

}
