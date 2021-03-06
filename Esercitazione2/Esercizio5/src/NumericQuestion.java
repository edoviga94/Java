import java.util.Scanner;

public class NumericQuestion extends Question {

	public NumericQuestion(String domanda, String risposta) {
		super(domanda, risposta);
	}

	public int ask() {
		Scanner in = new Scanner(System.in);
		System.out.println(getDomanda());
		int x = in.nextInt();
		if (x > 0 && x == Integer.parseInt(getRisposta())) {
			super.setPunteggio(10);
			System.out.println("Risposta giusta! Punteggio: " + super.getPunteggio());
		} else {
			super.setPunteggio(0);
			System.out.println("Risposta Sbagliata! Punteggio: " + super.getPunteggio());
		}

		return super.getPunteggio();
	}

}
