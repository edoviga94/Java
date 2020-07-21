
public class Immagine extends Elemento {

	private int luminosit�;

	public Immagine(String t, int luminosit�) {
		super(t);
		this.luminosit� = luminosit�;
	}

	public void aumenta() {
		brighter();
	}

	public void brighter() {
		luminosit�++;
	}

	public void diminuisci() {
		darker();
	}

	public void darker() {
		luminosit�--;
	}

	public void esegui() {
		show();
	}

	public void show() {
		String ret = getTitolo() + ": ";
		for (int i = 0; i < luminosit�; i++) {
			ret += "* ";
		}

		System.out.println(ret);
	}

}