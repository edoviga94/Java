
public class Car extends Vehicle {

	public String tipologia;

	public Car(String targa, String marca, String modello, boolean guasto, String tipologia) {
		super(targa, marca, modello, guasto);
		this.tipologia = tipologia;
	}
	
}
