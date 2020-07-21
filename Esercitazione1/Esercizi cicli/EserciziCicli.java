import java.util.Scanner;
public class EserciziCicli {





    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        boolean flag = true;
        int x;
        System.out.println("Inserire la sequenza di numeri terminata da 0:");
        do{
            x = in.nextInt();
            if(x < 0 || !(x % 2 == 0)) 
                flag = false;
        } while(x != 0);

        if (flag) {
            System.out.println("\nTutti positivi e pari");
        }
        else {
            System.out.println("\nNO");
        }

        double somma = 0;
        double numeri = 0;

        System.out.println();

        System.out.println("Inserire la sequenza di numeri terminata da 0:");

        do {
            x = in.nextInt();
            if(x % 3 == 0 && x != 0) {
                numeri++;
                somma += x;
            }
        } while (x != 0);

        double media = somma/numeri;

        System.out.println("\nMedia dei numeri inseriti divisibili per tre: "+media);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserire il numero di caratteri da inserire: ");
            int z = in.nextInt();

            if(z == 0)
                continue;

            int n = 0;
            System.out.println("Inserire i caratteri: ");
            while (n < z) {

                char c = in.next().charAt(0);
                System.out.println("Carattere appena inserito: " + c);
                n++;

            }

            System.out.println();
        }
    }
}