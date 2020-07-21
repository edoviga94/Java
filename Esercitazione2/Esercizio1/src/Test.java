public class Test {

	public static void main(String[] args) {

		Person p = new Person("Paolino", "Paperino", "FSTBZC78P27I821R", "Paperopoli");
	
		System.out.println("Nome: " +p.getName());
		System.out.println("Cognome: " +p.getSurname());
		System.out.println("Anno di Nascita: " +p.bornYear());
		
		Stagista[] array = new Stagista[3];
		array[0] = new Stagista("Wayne", "Bruce", "GVLLTD34A24F042C", "Gotham City", 12, 42);
		array[1] = new Stagista("Parker","Peter", "RMVQFO85H56L363J", "New York", 20, 22);
		array[2] = new Stagista("Gordon","Flash", "DYLCWC37D43I688N", "Rogue Town", 56, 56);
		
		int max = 0;
		int number = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].bornYear() > max) {
				max = array[i].bornYear();
				number = i;
			}		
		}
		System.out.println("Stagista pi� giovane: "+array[number].getName()+" "+array[number].getSurname());
	}
}
