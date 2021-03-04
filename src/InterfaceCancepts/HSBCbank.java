package InterfaceCancepts;

public class HSBCbank implements USBank,BrazilBank {

	public void credit() {
		
		System.out.println("HSBC...Credit");
		
	}
	
	public void debit() {
		
	System.out.println("HSBC...Debit");
		
	}
	
	public void tranfar() {
		
		System.out.println("HSB...Transfer");
		
	}
	
	public void educationloan() {
		System.out.println("HSBC..Education loan");
	}
	
	public void carloan() {
		
		System.out.println("HSBC...Car loan");
	}
	
	public void mutalfund() {
		
		System.out.println("HSBC...Mutalfund");
	}
	public void imps() {
		System.out.println("HSBC..IMPS");
	}
}
