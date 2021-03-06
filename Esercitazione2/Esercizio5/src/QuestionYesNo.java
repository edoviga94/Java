import java.util.Scanner;

public class QuestionYesNo extends Question {

	public QuestionYesNo(String domanda, String risposta) {
		super(domanda, risposta);
	}

	public int ask() {
		Scanner in = new Scanner(System.in);
		System.out.println(getDomanda());
		String s = in.nextLine();
		if (s.equalsIgnoreCase("si")) {
			setPunteggio(10);
			System.out.println("Risposta giusta! Punteggio: " + getPunteggio());
		} else if (s.equalsIgnoreCase("no")) {
			setPunteggio(0);
			System.out.println("Risposta Sbagliata! Punteggio: " + getPunteggio());
		} else {
			System.out.println("Tipo di rispota sbagliata! Rispondere con si oppure no!");
		}

		return getPunteggio();
	}

}
