import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TestEsercizio2 {

	public static LinkedList<Integer> creaRandomCrescente(int n) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			Random r = new Random();
			list.add(r.nextInt(100));
		}

		Collections.sort(list);

		return list;
	}

	public static LinkedList<Integer> parseString(LinkedList<String> a) {
		LinkedList<Integer> res = new LinkedList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			res.add(Integer.parseInt(a.get(i)));
		}

		return res;

	}

	public static void stampa(Iterator<?> i) {
		while (i.hasNext()) {
			System.out.print("<" + i.next() + ">");
			if (i.hasNext())
				System.out.print(", ");
		}
		System.out.println();
	}

	public static void provaEx2() {

		System.out.println("Test della LinkedList crescente");
		LinkedList<Integer> list = creaRandomCrescente(25);

		Iterator<Integer> i = list.iterator();
		stampa(i);

		int size = list.size();
		assert size == 30;

		int first = list.get(0);
		assert first == list.getFirst();

		int last = list.get(size - 1);
		assert last == list.getLast();

		System.out.println("\nTest della LinkedList formata da stringhe");

		Scanner in = new Scanner(System.in);
		System.out.println("Inserire 10 stringhe(con almeno 2 cifre)");
		LinkedList<String> listString = new LinkedList<String>();
		try {
			for (int j = 0; j < 9; j++) {
				String s = in.next();
				if(s.length() < 2)
					throw new NotValidValueException();
				listString.add(s);
			}
		} catch(NotValidValueException e) {
			System.out.print(e);
			System.exit(0);
			
		}

		

		LinkedList<Integer> tmp = parseString(listString);
		Iterator<Integer> it = tmp.iterator();
		stampa(it);
		
		
		int firstTmp = tmp.getFirst();
		assert firstTmp == tmp.get(0);
		
		int lastTmp = tmp.getLast();
		assert lastTmp == tmp.get(size - 1);
		
		int sizeTmp = 10;
		assert sizeTmp == tmp.size();
	}
	
	

	public static void main(String[] args) {

		provaEx2();

	}
}
