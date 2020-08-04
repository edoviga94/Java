import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		List<MeteoCitta> list = new ArrayList<MeteoCitta>();
		Scanner in = new Scanner(System.in);
		OutputStream outStream;
		ObjectOutputStream objOut;

//		
//		list.add(new MeteoCitta("Soleggiato", 35));
//		list.add(new MeteoCitta("Pioggia", 22));
//		list.add(new MeteoCitta("Neve", -4));
//		list.add(new MeteoCitta("Nuvoloso", 15));
//		list.add(new MeteoCitta("Sereno", 27));

		for (int i = 0; i < 5; i++) {
			System.out.print("Inserire il meteo e i gradi della città " + (i + 1) + ": ");
			String s = in.next();
			int g = in.nextInt();
			list.add(new MeteoCitta(s, g));

		}

		try {

			System.out.println("\nAccensione del server");
			System.out.println("In attesa di un client");
			ServerSocket ss = new ServerSocket(4200);
			Socket s = ss.accept();

			outStream = s.getOutputStream();
			objOut = new ObjectOutputStream(outStream);

			System.out.println("Connessione con il server instaurata");

			System.out.print("Selezionare una città scegliendo con un numero fra 1 e 5: ");

			in = new Scanner(System.in);
			int città = in.nextInt();

			for (int i = 0; i < list.size(); i++) {
				if (i != città)
					objOut.writeObject(list.get(i));
			}

			in.close();
			s.close();
			ss.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
