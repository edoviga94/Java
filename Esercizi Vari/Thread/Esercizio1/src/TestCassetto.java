import java.util.Scanner;

public class TestCassetto {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Cassetto cassetto = new Cassetto();

		System.out.print("Inserire il numero di paghette da dare al figlio: ");
		int mesi = in.nextInt();

		Genitore g = new Genitore(cassetto);
		Thread t1 = new Thread(g);
		t1.start();
		
		Figlio f = new Figlio(cassetto);
		

		for (int i = 0; i < mesi; i++) {
			Thread t2 = new Thread(f);
			t2.start();
			t2.interrupted();
		}
		
		in.close();
	}

}
