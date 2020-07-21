
public class Filmato extends Elemento {

	private int volume;
	private int durata;
	private int luminosit�;
	
	
	public Filmato(String s, int volume, int durata, int luminosit�) {
		super(s);
		this.volume = volume;
		this.durata = durata;
		this.luminosit� = luminosit�;
	}
	
	public void weaker() {
		volume--;
	}

	public void louder() {
		volume++;
	}
	
	public void brighter() {
		luminosit�++;
	}

	
	public void darker() {
		luminosit�--;
	}
	
	
	
	public void aumenta() {
		brighter();
		louder();
	}
	
	
	public void diminuisci() {
		darker();
		weaker();
	}
	
	
	
	public void esegui() {
		play();
	}
	
	public void play() {
		String ret = getTitolo()+": ";
		for (int i = 0; i < volume; i++) {
			ret += "! ";
		}
		
		for (int i = 0; i < luminosit�; i++) {
			ret += "* ";
		}
		
		
		for (int i = 0; i < durata; i++) {
			System.out.println(ret);
		}
	}

	
	
}
