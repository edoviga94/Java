
public class Tessera {
	private int codice;
	private double credito;

	public Tessera(int codice, double credito) {
		this.codice = codice;
		this.credito = credito;
	}

	public void caricaTessera(double credito) {
		this.credito += credito;
	}
	
	

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		String s = "[" + codice + ": " + credito + "]";
		return s;
	}

}
