import java.io.File;
import java.nio.file.Files;

public class TestEsercizio1 {

	public static void main(String[] args) {
		File origin = new File("prova.jfif");
		File dest = new File("copia.jfif");
		
		try {
			Files.copy(origin.toPath(), dest.toPath());
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		
//		dest.delete();

	}

}
