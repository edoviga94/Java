import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestEsercizio3 {

	public static void main(String[] args) {

		File f = new File("prova.txt");

		Scanner in = new Scanner(System.in);

		System.out.println("Inserire il numero double da scrivere su file");

		String s = in.next();

		try (FileWriter fw = new FileWriter(f)) {

			fw.write(s);
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
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
