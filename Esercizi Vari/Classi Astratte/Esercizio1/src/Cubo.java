
public class Cubo extends Solido {

	private double lato;

	public Cubo(double lato) {
		this.lato = lato;
	}

	@Override
	public double calcoloV() {
		double result = Math.pow(lato, 3);
		return result;
	}

	@Override
	public void stampaV() {
		super.stampaV();

	}

}
