
public class ProdottiNonAlimentari extends Prodotti {

	private String materiale;

	public ProdottiNonAlimentari(String codiceABarre, String descrizione, int prezzo, String materiale) {
		super(codiceABarre, descrizione, prezzo);
		this.materiale = materiale;
	}

	public String toString() {
		String s = super.toString();
		s = s + "Materiale: " + this.materiale + "\n";

		return s;
	}
	
	@Override
	public void applicaSconto() {
		if(materiale.equalsIgnoreCase("carta") ||
		   materiale.equalsIgnoreCase("vetro") ||
		   materiale.equalsIgnoreCase("plastica")) {
			
			double sconto = (super.getPrezzo() * 10/100);
			super.setPrezzo(super.getPrezzo() - sconto);
			
		}
	}

}
