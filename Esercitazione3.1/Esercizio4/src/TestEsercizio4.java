import java.util.LinkedList;

public class TestEsercizio4 {

	public static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n) {
		LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();

		for (int i = 0; i < n; i++) {

			LinkedList<Integer> intern = new LinkedList<Integer>();
			for (int j = 0; j <= i; j++) {
				intern.add(j);
			}

			list.add(intern);
		}

		return list;
	}

	
	public static void stampa(LinkedList<LinkedList<Integer>> a) {
		
		
		for (int i = 0; i < a.size(); i++) {
			LinkedList<Integer> intern = a.get(i);
			System.out.print("Elemento "+(i+1)+": ");
			for (int j = 0; j < intern.size() ; j++) {
				
				System.out.print("<" + intern.get(j) + "> ");
				
			}
			System.out.println();
		}
		
	}
	
	
	public static void testEs4() {
		int dim = (int) (Math.random() * 20) + 1;
		System.out.println("Dimensione della LinkedList: "+dim+"\n");

		
		LinkedList<LinkedList<Integer>> lista = insiemeDiInsiemi(dim);
		
		
		
		stampa(lista);
	}

	public static void main(String[] args) {
		testEs4();
	}

}
