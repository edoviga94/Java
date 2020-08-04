import java.util.Scanner;

public class TestCassetto {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Cassetto cassetto = new Cassetto();

		

		Genitore g = new Genitore(cassetto);
		Thread t1 = new Thread(g);
		t1.start();
		
		Figlio f = new Figlio(cassetto);
		

		for (int i = 0; i < 5; i++) {
			Thread t2 = new Thread(f);
			t2.start();
			
		}
		
		in.close();
	}

}
