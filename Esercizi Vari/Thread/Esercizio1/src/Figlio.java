
public class Figlio implements Runnable {

	Cassetto c;
	int paghetta;

	public Figlio(Cassetto c) {
		this.c = c;
		paghetta = 0;
	}

	@Override
	public void run() {
		int tot = 0;
		int i = 1;
		while (true) {
			tot += c.prendi();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Somma ricevuta al mese numero " + i + ": " + tot);
			i++;
		}

	}

}
