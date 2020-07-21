//Caso concreto
//public class Moneta {
//	
//	private String valore;
//
//	public String lancia() {
//		
//		int res = (int)Math.random()*2;
//		if(res == 0)
//			valore = "testa";
//		else
//			valore = "croce";
//		return valore;
//		
//	}
//	
//	public void stampa() {
//		System.out.println("Risultato del lancio della moneta: "+lancia());
//	}
//	
//	
//	
//
//}

public class Moneta extends OggetoD_azzardo {
	
	

	public Moneta() {
		super();
	}

	public void lancia() {
		int res = (int)(Math.random() * 2);
		if (res == 0)
			super.setValore("testa");
		else
			super.setValore("croce");

	}

	public void stampa() {
		System.out.println("Risultato del lancio della moneta: " + super.getValore());
	}
}
