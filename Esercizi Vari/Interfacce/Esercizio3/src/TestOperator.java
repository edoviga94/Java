import java.util.*;

public class TestOperator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean flag = true;

		do {

			System.out.println("Che operazione si vuole eseguire?");
			System.out.println("_Addizione(+)");
			System.out.println("_Moltiplicazione(*)");
			System.out.println("_Divisione(/)");
			System.out.println("_Uscire(x)");

			char input = in.next().charAt(0);

			switch (input) {
			case '+': {

				System.out.println("Inserire i due operandi: ");
				double op1 = in.nextDouble();
				double op2 = in.nextDouble();
				Addition add = new Addition(op1, op2);
				add.stampa();
				break;

			}

			case '*': {
				System.out.println("Inserire i due operandi: ");
				double op1 = in.nextDouble();
				double op2 = in.nextDouble();
				Multiply mul = new Multiply(op1, op2);
				mul.stampa();
				break;
			}

			case '/': {
				System.out.println("Inserire i due operandi: ");
				double op1 = in.nextDouble();
				double op2 = in.nextDouble();
				Divide div = new Divide(op1, op2);
				div.stampa();
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
