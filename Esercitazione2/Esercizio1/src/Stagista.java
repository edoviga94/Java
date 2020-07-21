public class Stagista extends Person {
	
	private int numberOfPresence;
	private int idNumber;
	
	
	public Stagista(String surname, String name, String taxCode, String city, int number, int id) {
		super(surname, name, taxCode, city);
		this.numberOfPresence = number;
		this.idNumber = id;
	}

	public int getNumberOfPresence() {
		return numberOfPresence;
	}

	public void setNumberOfPresence(int numberOfPresence) {
		this.numberOfPresence = numberOfPresence;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

}
