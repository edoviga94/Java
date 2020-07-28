
public class Colonna {

	private int numC;
	private String tipoB;
	private int numB;

	public void aggiornaColonna(int numC, String bevanda, int lattine) {
		this.numC = numC;
		this.tipoB = bevanda;
		this.numB = lattine;
	}

	public int getNumC() {
		return numC;
	}

	public void setNumC(int numC) {
		this.numC = numC;
	}

	public String getTipoB() {
		return tipoB;
	}

	public void setTipoB(String tipoB) {
		this.tipoB = tipoB;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	@Override
	public String toString() {
		String s = "[Colonna: " + numC + ", Bibita: " + tipoB + ", Lattine: " + numB + "]";
		return s;
	}

}
