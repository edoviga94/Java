
public class Bevanda {
	
	private String codice;
	private String nome;
	private double prezzo;
	
	
	public Bevanda(String codice, String nome, double prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}
	
	public String getName() {
		return nome;
	}
	
	public double getPrice() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		String s = "["+codice+", "+ nome+", "+prezzo+"]";
		return s;
	}
	
}
