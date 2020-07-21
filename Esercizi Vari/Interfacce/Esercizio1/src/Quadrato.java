
public class Quadrato implements Esponenziale {

	private double valore;

	public Quadrato(double valore) {
		this.valore = valore;
	}

	@Override
	public void eleva() {
		valore = Math.pow(valore, 2);
	}

	@Override
	public String toString() {
		String s = "" + valore;
		return s;
	}
}
