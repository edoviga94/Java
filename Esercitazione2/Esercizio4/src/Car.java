
public class Car extends Vehicle {

	public int cilindrata;

	public Car(String targa, String marca, String modello, boolean guasto, int cilindrata) {
		super(targa, marca, modello, guasto);
		this.cilindrata = cilindrata;
	}
	
}
