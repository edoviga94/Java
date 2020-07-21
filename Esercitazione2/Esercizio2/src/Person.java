public class Person {
	
	private String surname;
	private String name;
	private String taxCode;
	private String city;

	public Person() {
		
		this.surname = null;
		this.name = null;
		this.taxCode = null;
		this.city = null;
	}

	public Person(String surname, String name, String taxCode, String city) {
		this.surname = surname;
		this.name = name;
		this.taxCode = taxCode;
		this.city = city;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int bornYear() {
		String s = "19"+this.taxCode.charAt(6) + this.taxCode.charAt(7);
		int year = Integer.parseInt(s);
		return year;
	}
		
	public void printInfo() {
		System.out.println("Cognome: " +this.surname);
		System.out.println("Nome: " +this.name);
		System.out.println("Codice Fiscale: " +this.taxCode);
		System.out.println("Città: " +this.city);
	}

}
