import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		System.out.println("Accensione del server....");
		System.out.println("In attesa di un client...");

		DataInputStream in;
		DataOutputStream out;
		BufferedReader d;
		BufferedReader tastiera;
		String letto;
		String risposta;

		try {
			ServerSocket ss = new ServerSocket(4200);
			Socket soc = ss.accept();
			
			in = new DataInputStream(soc.getInputStream());
			out = new DataOutputStream(soc.getOutputStream());
			tastiera = new BufferedReader(new InputStreamReader(System.in));
			d = new BufferedReader(new InputStreamReader(soc.getInputStream()));

			System.out.println("Connessione riuscita con il client");

			do {
				System.out.println("In attesa di un messaggio da parte del client...");

				letto = in.readLine();
				System.out.println("Messaggio ricevuto: " + letto);

				System.out.print("Messaggio da inviare al client (digitare \"esci \" per uscire): ");
				risposta = tastiera.readLine();
				out.writeBytes(risposta + "\n");
				//out.flush();
				
			} while (!letto.equals("esci") || !risposta.equals("esci"));

			System.out.println("Chiudo la connessione");

			soc.close();
			ss.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
