import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TestEsercizio1 {

	public static LinkedList<Integer> creaRandom(int n, int max) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			Random r = new Random();
			list.add(r.nextInt(max - 1));
		}

		return list;
	}

	public static void stampa(Iterator<Integer> i) {
		while (i.hasNext()) {
			System.out.print("<" + i.next() + ">");
			if (i.hasNext())
				System.out.print(", ");
		}
		System.out.println();
	}

	public static void provaEx1() {


		LinkedList<Integer> lista = creaRandom(20, 100);

		Iterator<Integer> i = lista.iterator();
		stampa(i);

		int primo = lista.getFirst();
		assert primo == lista.get(0);

		int size = lista.size();
		assert size == 20;

		int ultimo = lista.getLast();
		assert ultimo == lista.get(size - 1);

	}

	public static ArrayList<Integer> creaRandomArray(int n, int max) {
		ArrayList<Integer> lista = new ArrayList<Integer>(n);
		
		for (int i = 0; i < n; i++) {
			Random r = new Random();
			lista.add(r.nextInt(max - 1));
		}
		

		return (lista);
	}

	public static void provaEx1Array() {


		ArrayList<Integer> list;
		list = creaRandomArray(20, 100);


		Iterator<Integer> i = list.iterator();
		stampa(i);

		int size = list.size();
		assert size == 20;

		list.set(size-1, 33);
		assert 33 == list.get(size - 1);

	}


	public static void main(String[] args) {
		
		System.out.println("Costruzione tramite Linked List");
		provaEx1();

		System.out.println("\nCostruzione tramite ArrayList");
		provaEx1Array();

		
		
		
	}

}
