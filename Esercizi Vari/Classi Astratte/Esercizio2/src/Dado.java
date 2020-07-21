// Caso concreto
//public class Dado {
//
//	private int valore;
//
//	public int lancia() {
//
//		valore = (int) (Math.random() * 6 + 1);
//
//		return valore;
//
//	}
//
//	public void stampa() {
//		System.out.println("Risultato del lancio del dado: " + lancia());
//	}
//
//}


public class Dado extends OggetoD_azzardo {
	
	
	
	public Dado() {
		super();
	}

	@Override
	public void lancia() {
		int res = (int) (Math.random() * 6 + 1);
		super.setValore(""+res);
	}
	
	@Override
	public void stampa() {
		System.out.println("Risultato del lancio del dado: " + super.getValore());
	}
}
