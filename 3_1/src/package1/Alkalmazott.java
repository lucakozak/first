package package1;

public class Alkalmazott {
	private String name;
	private int payment;

	public void fizNov(int fizBe) {
		payment += fizBe;
	}

	public String szovegVissza() {
		String s;
		s = "Nev: " + name + "Fizetes:" + payment;
		return s;

		// return "Nev: " + name + "Fizetes:" + payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameIn) {
		name = nameIn;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int paymentIn) {
		payment = paymentIn;
	}

	public boolean fizHatar(int min, int max) {

		if (payment >= min && payment <= max)
			return true;

		return false;
	}

	public double getAdo() {
		return (double)payment * ((double)16 / (double)100);
	}

	public boolean nagyobbE(Alkalmazott a) {
		if(payment > a.payment)
			return true;
		return false;
	}
}
