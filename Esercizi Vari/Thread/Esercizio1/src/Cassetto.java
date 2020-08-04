
public class Cassetto {

	private int paghetta;
	private int mese = 0;	



	public int getPaghetta() {
		return paghetta;
	}

	public void setPaghetta(int paghetta) {
		this.paghetta = paghetta;
	}

	public synchronized void add(int amount) {
		while (paghetta > 0 ) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		paghetta = amount;
		mese++;
		notify();
		System.out.println("Paghetta mese "+mese+" aggiunta: "+amount);
		
	}

	public synchronized int prendi() {

		while (paghetta <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int p = paghetta;
		paghetta = 0;
		notify();
		System.out.println("Paghetta mese " +mese+" ritirata: "+p);
		return p;
		
	}

}
