package AbstractionConcepts;

public class TestCalssAbstraction {

	public static void main(String[] args) {

		HDFCBank b = new HDFCBank();

		b.loan();
		b.credit();
		b.debit();
		b.carloan();

		/// by using dynamic poly.
		Bank a = new HDFCBank();
		a.loan();
		a.credit();
		a.debit();

		// This is partial abs.
		// hiding the implementation logic is called Abstraction

	}

}
