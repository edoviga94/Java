
public class Divide extends Stampa implements Operazione {

	private double op1;
	private double op2;

	public Divide(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public double eseguiOp() {
		if (op2 != 0)
			return op1 / op2;
		else {
			System.err.println("Non è possibile dividere per 0");
			return -1;
		}

	}

	@Override
	public void stampa() {

		double res = eseguiOp();

		if (res == -1) {
			System.err.println("Non è possibile eseguire l'operazione richiesta\n");
		}

		else {
			System.out.println("Il risultato dell'operazione è: " + res + "\n");

		}

	}

}
