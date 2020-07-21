
public class TestVehicles {

	public static void main(String[] args) {
		
		Vehicle[] array = new Vehicle[8];
		
		array[0] = new Vehicle("FV432BR","Alpine", "A110", true);
		array[1] = new Car("ER836PS","Dacia", "Sandero", false, "mini Suv");
		array[2] = new Motorcycle("EM762NW","Aprilia", "RS", true, 125);
		array[3] = new Vehicle("RN135MV","Fisker", "Karma", false);
		array[4] = new Car("BR738XP","Dodge", "Charger", true, "americana");
		array[5] = new Motorcycle("NE017SS","Benelli", "Ciao", false, 900);
		array[6] = new Vehicle("NE666CD","Wolswagen", "Polo", true);
		array[7] = new Car("FH349BV","Audi", "A3", false, "Sportiva");

		for (int i = 0; i < array.length; i++) {
			if(array[i].isGuasto()) 
				System.out.println(array[i].getTarga());
		}

	}

}
