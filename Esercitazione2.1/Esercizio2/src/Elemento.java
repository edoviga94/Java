
public abstract class Elemento {

	private String titolo;
	
	public Elemento(String s) {
		titolo = s;
	}

	public String getTitolo() {
		return titolo;
	}

	public void esegui() {}
	
	public void aumenta() {}
	
	public void diminuisci() {}
	
	

}
