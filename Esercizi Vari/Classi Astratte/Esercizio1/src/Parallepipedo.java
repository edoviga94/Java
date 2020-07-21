
public class Parallepipedo extends Solido {

	private double base_r;
	private double altezza_r;
	private double altezza_p;

	public Parallepipedo(double base_r, double altezza_r, double altezza_p) {
		this.base_r = base_r;
		this.altezza_r = altezza_r;
		this.altezza_p = altezza_p;
	}

	@Override
	public void stampaV() {
		// TODO Auto-generated method stub
		super.stampaV();
	}

	@Override
	public double calcoloV() {

		double sup = base_r * altezza_r;
		double result = sup * altezza_p;
		return result;
	}

}
