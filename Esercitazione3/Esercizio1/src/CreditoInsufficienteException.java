
public class CreditoInsufficienteException extends Exception {
	
	public CreditoInsufficienteException() {
		super("Credito Non Sufficiente");
	}

	public CreditoInsufficienteException(String s) {
		super(s);
	}
}
