import java.util.HashSet;

public class Distributore extends BevandaNonValidaException {

	private HashSet<Bevanda> distributore;
	

	public Distributore() {
		
		distributore = new HashSet<Bevanda>();
	}

	public void aggiungiBevanda(Bevanda b) {
		distributore.add(b);
	}

	public double getPrice(String codice) throws BevandaNonValidaException {
		double res = 0.0;
		if (!(distributore.contains(codice))) {
			throw new BevandaNonValidaException();
		}

		for (Bevanda b : distributore) {
			if (b.getCodice().equals(codice)) {
				res = b.getPrice();
			}
		}

		return res;
	}

	public String getName(String codice) throws BevandaNonValidaException {
		String res = "";
		if (!(distributore.contains(codice))) {
			throw new BevandaNonValidaException();
		}

		for (Bevanda b : distributore) {
			if (b.getCodice().equals(codice)) {
				res = b.getName();
			}
		}

		return res;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Bevanda b : distributore) {
			s += b.toString() + '\n';
		}

		return s;
	}

}
