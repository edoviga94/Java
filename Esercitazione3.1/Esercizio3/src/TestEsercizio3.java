import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TestEsercizio3 {

	public static void riempiList(LinkedList<Integer> list) {
		int dim1 = (int) (Math.random() * 20) + 1;

		for (int i = 0; i < dim1; i++) {
			Random r = new Random();
			list.add(r.nextInt(100));

			Collections.sort(list);
		}
	}

	public static LinkedList<Integer>  mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b) {
		LinkedList<Integer> res = new LinkedList<Integer>();
				
		while (a.hasNext()) {
			res.add(a.next());
		}
		
		while (b.hasNext()) {
			res.add(b.next());
		}
		
		
		Collections.sort(res);
		
		return res;
	}

	public static void stampa(Iterator<Integer> i) {
		while (i.hasNext()) {
			System.out.print("<" + i.next() + ">");
			if (i.hasNext())
				System.out.print(", ");
		}
		System.out.println();
	}

	public static void testEx3() {

		LinkedList<Integer> first = new LinkedList<Integer>();

		riempiList(first);

		Iterator<Integer> i = first.iterator();

		System.out.println("Prima LinkedList");
		stampa(i);

		LinkedList<Integer> second = new LinkedList<Integer>();

		riempiList(second);

		Iterator<Integer> j = second.iterator();

		System.out.println("\nSeconda LinkedList");
		stampa(j);
		
		i = first.iterator();
		j = second.iterator();
		

		LinkedList<Integer> last = mergeOrdinato(i, j);
		Iterator<Integer> lastIt = last.iterator();
		System.out.println("\nLista creata unendo le altre due: ");
		stampa(lastIt);
		
		
		int primoL1 = first.getFirst();
		int primoL2 = second.getFirst();
		
		if (primoL1 < primoL2) 
			assert primoL1 == last.getFirst();		
		else
			assert primoL2 == last.getFirst();
		
		
		int ultimoL1 = first.getLast();
		int ultimoL2 = second.getLast();
		
		if (ultimoL1 > ultimoL2) 
			assert ultimoL1 == last.getLast();		
		else
			assert ultimoL2 == last.getLast();

		int sizeT = last.size();
		assert sizeT == (first.size() + second.size());
	}

	public static void main(String[] args) {

		testEx3();

	}

}
