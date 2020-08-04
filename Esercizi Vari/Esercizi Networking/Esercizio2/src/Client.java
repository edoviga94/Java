import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

		DataInputStream stdIn;
		DataOutputStream out;
		BufferedReader in;
		BufferedReader key = null;
		String letto;
		String ricevuta;
		
		try {
			Socket soc = new Socket(InetAddress.getLocalHost(), 4200);
			System.out.println("Connessione alla porta " + soc.getPort());

			stdIn = new DataInputStream(soc.getInputStream());
			out = new DataOutputStream(soc.getOutputStream());
			in = new BufferedReader(new InputStreamReader(soc.getInputStream()));


			do {
				System.out.print("Messaggio da inviare al server (digitare \"esci \" per uscire): ");
				key = new BufferedReader(new InputStreamReader(System.in));

				letto = key.readLine();
				out.writeBytes(letto + "\n");
				
				ricevuta = in.readLine();
				
				

				System.out.println("Messaggio ricevuto: " + ricevuta);
			} while (!letto.equals("esci") || !ricevuta.equals("esci"));

			System.out.println("Chiudo la connessione");
			soc.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
