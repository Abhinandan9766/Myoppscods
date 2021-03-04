package AbstractionConcepts;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("HDFC..loan");
	}

	/// HDFC BAnk own method
	public void carloan() {

		System.out.println("HDFC BAnk...carloan");
	}

}
