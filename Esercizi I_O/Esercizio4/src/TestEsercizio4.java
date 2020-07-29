import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class TestEsercizio4 {

	public static void main(String[] args) {

		ArrayList<Impiegato> list = new ArrayList<Impiegato>();

		boolean cont = true;

		list.add(new Impiegato("Paperino", 1500, new Date()));
		list.add(new Impiegato("Paolino", 500, new Date()));
		list.add(new Impiegato("Mickey", 2500, new Date()));
		list.add(new Impiegato("Mouse", 4500, new Date()));
		list.add(new Impiegato("Goofy", 9000, new Date()));
		list.add(new Impiegato("Pluto", 10000, new Date()));
		list.add(new Impiegato("Zio Paperone", 150000, new Date()));

		System.out.println(list);

		try (FileOutputStream fis = new FileOutputStream("prova.txt")) {
			ObjectOutputStream out = new ObjectOutputStream(fis);
			out.writeObject(list);
			
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		
		System.out.println("\nStampa della lettura dal file");
		
		try (FileInputStream fis = new FileInputStream("prova.txt")){
			ObjectInputStream out = new ObjectInputStream(fis);
			
			System.out.println(out.readObject());
			
			out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
