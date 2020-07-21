
public class Prodotti {
	private String codiceABarre;
	private String descrizione;
	private double prezzo;

	public Prodotti(String codiceABarre, String descrizione, int prezzo) {
		this.codiceABarre = codiceABarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public String getCodiceABarre() {
		return codiceABarre;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void applicaSconto() {
		double sconto = (prezzo * 5 / 100);
		prezzo -= sconto;

	}

	public boolean equals(Prodotti p) {
		if (p.getCodiceABarre() == this.codiceABarre)
			return true;
		else
			return false;
	}

	public void setCodiceABarre(String codiceABarre) {
		this.codiceABarre = codiceABarre;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String toString() {
		String s = "Info del Prodotto\n";
		s = s + "Codice a barre: " + this.codiceABarre + "\n";
		s = s + "Descrizione: " + this.descrizione + "\n";
		s = s + "Prezzo unitario: " + this.prezzo + "\n";

		return s;
	}
}
