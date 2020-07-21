import java.util.Date;

public class ProdottiAlimentari extends Prodotti {

	private Date scadenza;

	public ProdottiAlimentari(String codiceABarre, String descrizione, int prezzo, Date scadenza) {
		super(codiceABarre, descrizione, prezzo);
		this.scadenza = scadenza;
	}

	public String toString() {
		String s = super.toString();
		s = s + "Scadenza: " + this.scadenza + "\n";

		return s;
	}

	@Override
	public void applicaSconto() {
		
		Date today = new Date();
		int diff = today.getDay() - scadenza.getDay();
		if(diff < 10) {
			double sconto = (super.getPrezzo() * 20/100);
			super.setPrezzo(super.getPrezzo() - sconto);
		}
		
	}
}
