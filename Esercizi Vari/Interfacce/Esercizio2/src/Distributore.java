
public class Distributore implements Comparable<Distributore> {

	private String citt�;
	private String proprietario;
	private double capacit�;
	private double benzina_contenuta;

	public Distributore(String citt�, String proprietario, double capacit�, double benzina_contenuta) {
		this.citt� = citt�;
		this.proprietario = proprietario;
		this.capacit� = capacit�;
		this.benzina_contenuta = benzina_contenuta;
	}

	public void eroga(int amount) {

		if (benzina_contenuta < amount) {

			System.out.println("Non si possiede abbastanza benzina");

		} else {
			benzina_contenuta -= amount;
			System.out.println("Soldi guadagnati: " + (amount * 1.5)+"\n");
		}

	}

	@Override
	public int compareTo(Distributore d) {
		if (capacit� < d.getCapacit�()) {
			System.out.println("Il primo distrubutore � pi� piccolo del secondo\n");
			return -1;
		}
			
		else if (capacit� == d.getCapacit�()) {
			System.out.println("I due distributori hanno la stessa capacit�\n");
			return 0;
			}
		else {
			System.out.println("Il primo distrubutore � pi� grande del secondo\n");
			

			return 1;
		}
	}

	public double getCapacit�() {
		return capacit�;
	}

}
