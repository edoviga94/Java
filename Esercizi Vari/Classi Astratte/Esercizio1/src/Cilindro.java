
public class Cilindro extends Solido {

	private double raggio;
	private double altezza;

	public Cilindro(double raggio, double altezza) {

		this.raggio = raggio;
		this.altezza = altezza;
	}

	@Override
	public double calcoloV() {
		double areaB = raggio * raggio * Math.PI;
		double result = areaB * altezza;
		return result;
	}

	@Override
	public void stampaV() {
		super.stampaV();
	}

}
