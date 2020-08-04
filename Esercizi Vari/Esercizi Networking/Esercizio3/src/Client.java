import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

		ObjectInputStream objIn;
		InputStream inStream;

		try {
			Socket soc = new Socket(InetAddress.getLocalHost(), 4200);
			System.out.println("Connessione con il server riuscita");

			inStream = soc.getInputStream();
			objIn = new ObjectInputStream(inStream);

			System.out.println("Dati Meteo delle città: ");

			for (int i = 0; i < 4; i++) {

				MeteoCitta tmp = new MeteoCitta();
				try {
					tmp = (MeteoCitta) objIn.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("_" + tmp.getMeteo() + ", " + tmp.getGradi());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
