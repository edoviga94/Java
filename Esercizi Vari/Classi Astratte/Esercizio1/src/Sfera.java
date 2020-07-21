
public class Sfera extends Solido {

	private double raggio;

	public Sfera(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcoloV() {
		double result = Math.PI * (4/3) * Math.pow(raggio, 3);
		return result;
	}

	@Override
	public void stampaV() {
		// TODO Auto-generated method stub
		super.stampaV();
	}

}
