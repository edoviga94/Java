
public class TestGarage {

	public static void main(String[] args) {
		Garage g = new Garage();
		

		Vehicle[] array = new Vehicle[8];
		
		array[0] = new Vehicle("FV432BR","Alpine", "A110", true);
		array[1] = new Car("ER836PS","Dacia", "Sandero", false, 600);
		array[2] = new Motorcycle("EM762NW","Aprilia", "RS", true, "Sportiva");
		array[3] = new Vehicle("RN135MV","Fisker", "Karma", false);
		array[4] = new Car("BR738XP","Dodge", "Charger", true, 800);
		array[5] = new Motorcycle("NE017SS","Benelli", "Ciao", false, "Scooter");
		array[6] = new Vehicle("NE666CD","Wolswagen", "Polo", true);
		array[7] = new Car("FH349BV","Audi", "A3", false, 900);
		
		for (int i = 0; i < array.length; i++) {
			int costo = g.repair(array[i]);
			if(costo != 0)
				System.out.println("Costo della riparazione: " + costo);
			else
				System.out.println("Non c'è bisogno della riparazione");
		}
	}
}
