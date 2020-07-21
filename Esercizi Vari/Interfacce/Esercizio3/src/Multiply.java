
public class Multiply extends Stampa implements Operazione {

	private double op1;
	private double op2;

	public Multiply(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public double eseguiOp() {
		return op1 * op2;
	}

	@Override
	public void stampa() {
		System.out.println("Il risultato dell'operazione �: " + eseguiOp()+"\n");

	}
	
}
