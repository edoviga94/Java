import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEsercizio5 {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
		 
		 int count = 0;
		 
		 try(FileReader file = new FileReader("prova.txt")) {
			 Scanner sc = new Scanner(file);
			 
			 while(sc.hasNext()) {
				 if(!list.contains(sc.next())) {
					 list.add(sc.next());
					 count++;
				 }
			 }
			 
			 System.out.println("Numero di parole differenti: "+count);
			 
		 }
		 
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 

	}

}
