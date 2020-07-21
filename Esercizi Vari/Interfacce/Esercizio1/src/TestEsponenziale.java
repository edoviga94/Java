import java.util.Scanner;

public class TestEsponenziale {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Inserire il valore da elevare a potenza");
		double x = in.nextDouble();

		Quadrato q = new Quadrato(x);
		q.eleva();
		System.out.println("Valore del quadrato: " + q.toString());

		Cubo c = new Cubo(x);
		c.eleva();
		System.out.println("Valore del cubo: " + c.toString());

	}

}
