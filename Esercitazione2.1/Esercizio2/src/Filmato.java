
public class Filmato extends Elemento {

	private int volume;
	private int durata;
	private int luminosità;
	
	
	public Filmato(String s, int volume, int durata, int luminosità) {
		super(s);
		this.volume = volume;
		this.durata = durata;
		this.luminosità = luminosità;
	}
	
	public void weaker() {
		volume--;
	}

	public void louder() {
		volume++;
	}
	
	public void brighter() {
		luminosità++;
	}

	
	public void darker() {
		luminosità--;
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
		
		for (int i = 0; i < luminosità; i++) {
			ret += "* ";
		}
		
		
		for (int i = 0; i < durata; i++) {
			System.out.println(ret);
		}
	}

	
	
}
