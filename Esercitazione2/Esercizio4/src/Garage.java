
public class Garage {

	public int repair(Vehicle v) {
		int costo = 0;
		if (v.isGuasto()) {
			v.setGuasto(false);
			costo = 100;
		}

		return costo;
	}

}
