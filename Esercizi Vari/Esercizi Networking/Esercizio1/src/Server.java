import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

	public static void main(String[] args) {

		try {

			System.out.println("Aspettando un client");
			ServerSocket ss = new ServerSocket(4200);
			Socket soc = ss.accept();
			System.out.println("Connessione riuscita");

			//riceve il nome dal client e lo mette in str
			InputStreamReader isr = new InputStreamReader(soc.getInputStream());
			BufferedReader in = new BufferedReader(isr);
			String str = in.readLine();
			
			//manda la stringa al client
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			Date d = new Date();
			out.println("Ciao! Sei il client " + str + ", la data in cui è avvenuta la connessione è "
						+ d + ", sei il visitatore n° "+ ((int)Math.random()*20+1));

			
			
			in.close();
			isr.close();
			soc.close();
			ss.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
