
public class Genitore implements Runnable {

	Cassetto c;

	public Genitore(Cassetto c) {
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			int paghetta = (int) (Math.random() * 100);
			//System.out.println("Paghetta messa in questo mese: " + paghetta);
			c.add(paghetta);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
