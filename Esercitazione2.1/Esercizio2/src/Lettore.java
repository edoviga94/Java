import java.util.Scanner;

public class Lettore {

	public static void main(String[] args) {

		Elemento[] array = new Elemento[5];
		Scanner in = new Scanner(System.in);

		int riproduci = 0;
		char c;

		while (riproduci < 5) {
			System.out.println("Decidere che tipo di elemento multimediale inserire: I/F/A");
			c = in.next().charAt(0);
			switch (c) {
			case 'i': {
				System.out.println("Inserire titolo e luminosit�");
				String t = in.next();
				int l = in.nextInt();
				Immagine i = new Immagine(t, l);
				array[riproduci] = i;
				riproduci++;
				break;
			}
			
			case 'I': {
				System.out.println("Inserire titolo e luminosit�");
				String t = in.next();
				int l = in.nextInt();
				Immagine i = new Immagine(t, l);
				array[riproduci] = i;
				riproduci++;
				break;
			}

			case 'f': {
				System.out.println("Inserire titolo,luminosit�, durata e volume");
				String t = in.next();
				int l = in.nextInt();
				int d = in.nextInt();
				int v = in.nextInt();
				Filmato f = new Filmato(t, l, d, v);
				array[riproduci] = f;
				riproduci++;
				break;

			}
			
			case 'F': {
				System.out.println("Inserire titolo,luminosit�, durata e volume");
				String t = in.next();
				int l = in.nextInt();
				int d = in.nextInt();
				int v = in.nextInt();
				Filmato f = new Filmato(t, l, d, v);
				array[riproduci] = f;
				riproduci++;
				break;

			}

			case 'a': {
				System.out.println("Inserire titolo, durata e volume");
				String t = in.next();
				int d = in.nextInt();
				int v = in.nextInt();
				Audio a = new Audio(t, d, v);
				array[riproduci] = a;
				riproduci++;
				break;
			}
			
			case 'A': {
				System.out.println("Inserire titolo, durata e volume");
				String t = in.next();
				int d = in.nextInt();
				int v = in.nextInt();
				Audio a = new Audio(t, d, v);
				array[riproduci] = a;
				riproduci++;
				break;
			}

			default: {
				System.out.println("Input sbagliato!");
			}
			}
		}

		boolean flag = true;

		do {
			System.out.println("Decidere quale elemento eseguire: 1/5");
			int risposta = in.nextInt();
			if(risposta == 0) {
				flag = false;
				break;
			}
			else {
				array[risposta-1].esegui();
				System.out.println("Si vogliono cambiare parametri? Y/N");
				char s = in.next().charAt(0);
				if(s == 'y' || s == 'Y') {
					System.out.println("Aumentare o diminuire? A/D");
					char x = in.next().charAt(0);
					if (x == 'a' || x == 'A') {
						array[risposta-1].aumenta();
					}
					else 
						array[risposta-1].diminuisci();
				}
			}
		} while (flag);

	}
}

