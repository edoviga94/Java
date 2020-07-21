
public class Audio extends Elemento {
	private int volume;
	private int durata;

	public Audio(String s, int volume, int durata) {
		super(s);
		this.volume = volume;
		this.durata = durata;
	}

	public void diminuisci() {
		weaker();
	}
	
	public void weaker() {
		volume--;
	}
	
	public void aumenta() {
		louder();
	}

	public void louder() {
		volume++;
	}
	
	
	public void esegui() {
		play();
	}
	
	public void play() {
		String ret = getTitolo()+": ";
		for (int i = 0; i < volume; i++) {
			ret += "! ";
		}
		
		for (int i = 0; i < durata; i++) {
			System.out.println(ret);
		}
	}
}
