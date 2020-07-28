import java.util.HashSet;
import java.util.Scanner;

public class TestDistributore {

	public static void aggiungiBevanda(HashSet<Bevanda> d, Bevanda b) {
		d.add(b);
	}

	public static void aggiungiTessera(HashSet<Tessera> tessere, Tessera t) {
		tessere.add(t);
	}

	public static double getPrice(HashSet<Bevanda> d, String codice) {
		double res = 0;
		boolean flag = false;
		try {

			for (Bevanda b : d) {
				if (b.getCodice().equals(codice)) {
					res = b.getPrice();
					flag = true;

				}
			}
			if (!flag)
				throw new BevandaNonValidaException();

		} catch (BevandaNonValidaException e) {
			e.printStackTrace();

			System.exit(0);
		}

		return res;
	}

	public static String getName(HashSet<Bevanda> d, String codice) {
		String res = "";
		boolean flag = false;
		try {

			for (Bevanda b : d) {
				if (b.getCodice().equals(codice)) {
					res = b.getName();
					flag = true;
				}
			}
			if (!flag)
				throw new BevandaNonValidaException();

		} catch (BevandaNonValidaException e) {
			e.printStackTrace();
			System.exit(0);
		}

		return res;
	}

	public static double leggiCredito(HashSet<Tessera> t, int codice) {
		double res = 0;
		boolean flag = false;
		try {
			for (Tessera tessera : t) {
				if (tessera.getCodice() == codice) {
					res = tessera.getCredito();
					flag = true;
				}
			}
			if (!flag)
				throw new TesseraNonValidaException();

		} catch (TesseraNonValidaException e) {
			e.printStackTrace();
			System.exit(0);
		}

		return res;
	}

	public static int lattineDisponibili(String codice, HashSet<Bevanda> d, HashSet<Colonna> c) {

		int res = 0;

		String nome = getName(d, codice);

		for (Colonna colonna : c) {
			if (colonna.getTipoB().equals(nome)) {
				res += colonna.getNumB();
			}
		}

		return res;

	}

	public static int eroga(String codiceB, int codiceT, HashSet<Bevanda> bevande, HashSet<Tessera> tessera,
			HashSet<Colonna> colonna) {
		int res = 0;

		try {

			if (leggiCredito(tessera, codiceT) < getPrice(bevande, codiceB))
				throw new CreditoInsufficienteException();
			
			if (lattineDisponibili(codiceB, bevande, colonna) < 0)
				throw new BevandaEsauritaException();
			
			if ((leggiCredito(tessera, codiceT) >= getPrice(bevande, codiceB))
					&& (lattineDisponibili(codiceB, bevande, colonna) > 0)) {

				for (Tessera t : tessera) {
					if (t.getCodice() == codiceT) {
						double prezzo = getPrice(bevande, codiceB);
						t.setCredito(t.getCredito() - prezzo);
						System.out.println("Credito residuo: "+t.getCredito());
					}
				}
				
				String s = getName(bevande, codiceB);

				for (Colonna c : colonna) {
					if (c.getTipoB().equals(s)) {
						c.setNumB(c.getNumB() - 1);
						res = c.getNumC();
					}
				}
			}
		} catch (CreditoInsufficienteException e) {

			e.printStackTrace();
			System.exit(0);
		}

		catch (BevandaEsauritaException e) {
			e.printStackTrace();
			System.exit(0);
		}

		return res + 1;
	}

	public static void testEs1() {

		System.out.println("Test Distributore");

		HashSet<Bevanda> distributore = new HashSet();

		aggiungiBevanda(distributore, new Bevanda("A", "Acqua", 0.20));
		aggiungiBevanda(distributore, new Bevanda("B", "Coca", 0.30));
		aggiungiBevanda(distributore, new Bevanda("C", "Birra", 1));
		aggiungiBevanda(distributore, new Bevanda("D", "Fanta", 0.5));
		aggiungiBevanda(distributore, new Bevanda("E", "Aranciata", 0.72));
		aggiungiBevanda(distributore, new Bevanda("F", "Thè", 0.9));

		System.out.println(distributore + "\n");

		for (Bevanda bev : distributore) {

			System.out.println("Nome: " + getName(distributore, bev.getCodice()));
			System.out.println("Prezzo: " + getPrice(distributore, bev.getCodice()));
			System.out.println();

		}

		System.out.println(getName(distributore, "F") + ": " + getPrice(distributore, "F"));

		// Codice che genera un comando
		// System.out.println(getName(distributore, "XX"));

	}

	public static void testEs2() {

		System.out.println("\n\nTest Tessera");

		HashSet<Tessera> t = new HashSet<Tessera>();

		aggiungiTessera(t, new Tessera(12, 5.5));
		aggiungiTessera(t, new Tessera(21, 10.0));
		aggiungiTessera(t, new Tessera(99, 0.75));
		aggiungiTessera(t, new Tessera(34, 2.34));
		aggiungiTessera(t, new Tessera(47, 2.97));

		System.out.println(t);

		for (Tessera tessera : t) {
			tessera.caricaTessera((int) (Math.random() * 10));
		}

		for (Tessera tessera : t) {
			System.out.println(leggiCredito(t, tessera.getCodice()));
		}

		// Codice che genera un'eccezione
		// System.out.println(leggiCredito(t, 65));

	}

	public static void testEs3() {

		Scanner in = new Scanner(System.in);
		int tmp = 1;

		System.out.println("\n\nTest Colonna");

		HashSet<Bevanda> distributore = new HashSet();

		aggiungiBevanda(distributore, new Bevanda("A", "Acqua", 0.20));
		aggiungiBevanda(distributore, new Bevanda("B", "Coca", 0.30));
		aggiungiBevanda(distributore, new Bevanda("C", "Birra", 1));
		aggiungiBevanda(distributore, new Bevanda("D", "Fanta", 0.5));
		aggiungiBevanda(distributore, new Bevanda("E", "Aranciata", 0.72));
		aggiungiBevanda(distributore, new Bevanda("F", "Thè", 0.9));

		HashSet<Colonna> d = new HashSet<Colonna>();
		for (int i = 0; i < 4; i++) {
			d.add(new Colonna());
		}

		for (Colonna colonna : d) {
			System.out.println("Inserire il nome della bibita e il numero di lattine: ");

			String s = in.next();
			int l = in.nextInt();

			colonna.aggiornaColonna(tmp, s, l);
			tmp++;
		}

		System.out.println(d);

		System.out.println("Codice della lattina da cercare: ");
		String codice = in.next();

		int number = lattineDisponibili(codice, distributore, d);
		System.out.println("Numero di lattine relative al codice " + codice + ": " + number);

	}

	public static void testEs4() {

		Scanner in = new Scanner(System.in);

		HashSet<Bevanda> distributore = new HashSet();

		aggiungiBevanda(distributore, new Bevanda("A", "Acqua", 0.20));
		aggiungiBevanda(distributore, new Bevanda("B", "Coca", 0.30));
		aggiungiBevanda(distributore, new Bevanda("C", "Birra", 1));
		aggiungiBevanda(distributore, new Bevanda("D", "Fanta", 0.5));
		aggiungiBevanda(distributore, new Bevanda("E", "Aranciata", 0.72));
		aggiungiBevanda(distributore, new Bevanda("F", "Thè", 0.9));

		HashSet<Tessera> tessera = new HashSet<Tessera>();

		aggiungiTessera(tessera, new Tessera(12, 5.5));
		aggiungiTessera(tessera, new Tessera(21, 10.0));
		aggiungiTessera(tessera, new Tessera(99, 0.75));
		aggiungiTessera(tessera, new Tessera(34, 2.34));
		aggiungiTessera(tessera, new Tessera(47, 2.97));

		HashSet<Colonna> c = new HashSet<Colonna>();
		for (int i = 0; i < 4; i++) {
			c.add(new Colonna());
		}

		int tmp = 0;
		for (Colonna colonna : c) {
			System.out.println("Inserire il nome della bibita e il numero di lattine: ");

			String s = in.next();
			int l = in.nextInt();

			colonna.aggiornaColonna(tmp+1, s, l);
			System.out.println(colonna.getNumC());
			tmp++;
		}

		System.out.println("Inserire il codice della bevanda e il codice della tessera: ");
		String codiceB = in.next();
		int codiceT = in.nextInt();

		int colonna = eroga(codiceB, codiceT, distributore, tessera, c);
		System.out.println("Colonna da cui si è erogato: " + colonna);

	}

	public static void main(String[] args) {

		 testEs1();

		 testEs2();

		 testEs3();

		testEs4();

	}
}
