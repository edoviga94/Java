import java.util.Scanner;

public class TestSolidi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Scegliere la tipologia di solido");
		System.out.println("_Cubo(c)");
		System.out.println("_Cilindro(C)");
		System.out.println("_Parallepipedo(p)");
		System.out.println("_Sfera(s)");

		char x = in.nextLine().charAt(0);

		switch (x) {
		case 'c': {

			System.out.println("Inserire la dimensione del lato: ");
			double l = in.nextDouble();
			Cubo c = new Cubo(l);
			c.stampaV();
			break;
		}

		case 'C': {

			System.out.println("Inserire la dimensione del raggio e dell'altezza: ");
			double r = in.nextDouble();
			double h = in.nextDouble();
			Cilindro cl = new Cilindro(r, h);
			cl.stampaV();
			break;
		}

		case 'p': {

			System.out.println(
					"Inserire la dimensione di base e altezza del rettangolo di base e l'altezza del cilindro: ");
			double b_r = in.nextDouble();
			double h_r = in.nextDouble();
			double h = in.nextDouble();
			Parallepipedo p = new Parallepipedo(b_r, h_r, h);
			p.stampaV();
			break;
		}

		case 's': {

			System.out.println("Inserire la dimensione del raggio della sfera: ");
			double r = in.nextDouble();
			Sfera s = new Sfera(r);
			s.stampaV();
			break;
		}

		default:
			System.out.println("Input sbagliato");

		}

	}
}
