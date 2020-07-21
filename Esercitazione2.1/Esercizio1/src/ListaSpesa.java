import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ListaSpesa {
	
	public static void main(String[] args) throws ParseException {
		
		
		Scanner in = new Scanner(System.in);
		
		boolean sconto;
		
		System.out.println("Decidere quanti prodotti si vogliono acquistare");
		int x = in.nextInt();
		System.out.println("Si possieda la tessera fedeltà? Y/N");
		
		String risposta = in.next();
		if(risposta.equalsIgnoreCase("Y"))
			sconto = true;
		else
			sconto = false;
		Prodotti[] lista = new Prodotti[x];
		
		int totale = 0;
		
//		lista[0] = new Prodotti("A-0100-Z", "Bicchiere", 5);
//		lista[1] = new ProdottiAlimentari("D-7903-P", "Prosciutto", 3, scadenza1);
//		lista[2] = new ProdottiNonAlimentari("U-0395-M", "Carta per stampare", 20, "carta");
//		lista[3] = new ProdottiAlimentari("L-3490-F", "Gelato", 10, scadenza2);
//		lista[4] = new ProdottiNonAlimentari("W-9730-R", "Ferro da Stiro", 15, "Ferro");

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Decidere quale tipologia di prodotto acquistare: ");
			System.out.println("_Prodotto Normale (pn)");
			System.out.println("_Prodotto Alimentare (pa)");
			System.out.println("_Prodotto Non Alimentare (pna)");
			
			String scelta = in.next();
			
			if(scelta.equalsIgnoreCase("pn")) {
				System.out.println("Inserire codice a barre, descrizione e prezzo del prodotto");
				String cb = in.next();
				String descrizione = in.next();
				int prezzo = in.nextInt();
				Prodotti p = new Prodotti(cb, descrizione, prezzo);
				lista[i] = p;
				
			}
			else if(scelta.equalsIgnoreCase("pa")) {
				
				System.out.println("Inserire codice a barre, descrizione, prezzo e data di scadenza del prodotto");
				String cb = in.next();
				String descrizione = in.next();
				int prezzo = in.nextInt();
				String d = in.next();
				SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
				Date d2 = null;
				try {
					 d2 = data.parse(d);
				}
				catch (ParseException e) {
					e.printStackTrace();
				}
				ProdottiAlimentari p = new ProdottiAlimentari(cb, descrizione, prezzo, d2);
				lista[i] = p;
				
			}
			
			else if(scelta.equalsIgnoreCase("pna")) {
				System.out.println("Inserire codice a barre, descrizione, prezzo e materiale del prodotto");
				String cb = in.next();
				String descrizione = in.next();
				int prezzo = in.nextInt();
				String materiale = in.next();
				
				ProdottiNonAlimentari p = new ProdottiNonAlimentari(cb, descrizione, prezzo, materiale);
				lista[i] = p;
			}
			
			else 
				
				System.err.println("Input non valido");
			
		}
		
		
		for (int i = 0; i < lista.length; i++) {
			if(sconto)
				lista[i].applicaSconto();
			totale += lista[i].getPrezzo();
		}
		
		
		System.out.println("Totale della spesa: "+totale);
		
	}

}
