import java.util.Random;

public class TestQuestion {

	public static void main(String[] args) {

		Question[] domande = new Question[4];

		int[] array = { 2, 4, 6, 8 };

		domande[0] = new Question("Che cosa bolle?", "acqua");
		domande[1] = new QuestionYesNo("Il rosso � un colore?", "si");
		domande[2] = new NumericQuestion("Quanti erano i comandamenti?", "10");
		domande[3] = new MultipleQuestion("Numero pari minore di 10", "0", array);

		int result = 0;

		for (int i = 0; i < 3; i++) {
			int x = (int) (Math.floor(Math.random() * 4));
			result += domande[x].ask();
		}

		System.out.println("\nRisultato finale: " + result);

	}

}