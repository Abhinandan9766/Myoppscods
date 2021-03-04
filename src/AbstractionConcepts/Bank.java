package AbstractionConcepts;

public abstract class Bank {

	public abstract void loan();// ABs method no body in method

	// non static methods
	public void credit() {
		System.out.println("Bank...Credit");
	}

	public void debit() {
		System.out.println("Bank..Debit");
	}
}
