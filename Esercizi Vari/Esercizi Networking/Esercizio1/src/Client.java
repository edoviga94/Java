import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {

		try {

			System.out.println("client iniziato");
			Socket soc = new Socket("localhost", 4200);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader stdIn = new BufferedReader(isr);
			System.out.println("Inserire il nome del client: ");
			String name = stdIn.readLine();
			
			//manda il nome al server
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(name);
			
			//riceve e stampa il messaggio passatogli dal server
			InputStreamReader isr2 = new InputStreamReader(soc.getInputStream());
			BufferedReader in = new BufferedReader(isr2);
			System.out.println(in.readLine());
			
			
			in.close();
			stdIn.close();
			soc.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
