import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEsercizio2 {

	public static void main(String[] args) {
		
		File f = new File("prova.txt");
	
		

		
		try (FileInputStream fin = new FileInputStream(f)) {
			int contenuto;
			while((contenuto = fin.read()) != -1) {
				System.out.print((char) contenuto);
			}
			fin.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		

	
	}

}
