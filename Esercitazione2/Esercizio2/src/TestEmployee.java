public class TestEmployee {

	
	public static void ordinaArray(int[] ordine) {
		for (int i = 0; i < ordine.length; i++) {
			boolean flag = false;
			for (int j = 0; j < ordine.length-1; j++) {
				if (ordine[j] > ordine[j + 1]) {
					int k = ordine[j];
					ordine[j] = ordine[j + 1];
					ordine[j + 1] = k;
					flag = true;
				}
			}

			if (!flag)
				break;
		}
	}
	
	public static void main(String[] args) {
		Employee[] arrayEmployee = new Employee[3];
		
		arrayEmployee[0] = new Employee("Wayne", "Bruce", "GVLLTD34A24F042C", "Gotham City", 12, 42);
		arrayEmployee[1] = new Employee("Parker","Peter", "RMVQFO85H56L363J", "New York", 20, 22);
		arrayEmployee[2] = new Employee("Gordon","Flash", "DYLCWC37D43I688N", "Rogue Town", 56, 56);
		
		int[] ordine = new int[3];
		ordine[0] = arrayEmployee[0].getStipendio();
		ordine[1] = arrayEmployee[1].getStipendio();
		ordine[2] = arrayEmployee[2].getStipendio();
		
		ordinaArray(ordine);
		
		for (int i = arrayEmployee.length-1; i >= 0; i--) {
			for(int j = 0; j < arrayEmployee.length; j++)
			if(ordine[i] == arrayEmployee[j].getStipendio()) 
				arrayEmployee[j].visualize();
		}
	}
	
	
}
