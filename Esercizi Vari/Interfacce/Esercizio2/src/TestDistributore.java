import java.util.Scanner;

public class TestDistributore {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Distributore d1 = new Distributore("Seregno", "Mario Rossi", 2500, 1000);
		Distributore d2 = new Distributore("Giussano", "Stefano Bianchi", 1000, 500);

		boolean flag = true;
		do {

			System.out.println("Che azione si vuole fare?");
			System.out.println("_Fare benzina(f)");
			System.out.println("_Confrontare(c)");
			System.out.println("_Uscire(u)");

			char input = in.next().charAt(0);

			switch (input) {
			case 'f': {

				System.out.println("Inserire la quantit� di benzina: ");
				int x = in.nextInt();
				d1.eroga(x);
				break;

			}

			case 'c': {
				d1.compareTo(d2);
				break;
			}
			default:
				System.out.println("Arrivederci!");
				flag = false;
				break;
			}

		} while (flag);

	}
}