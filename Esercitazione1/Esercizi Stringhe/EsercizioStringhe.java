import java.util.Scanner;
public class EsercizioStringhe {

    public static void stampaReverse(String s) {

        
        String s1 = "";
        for (int i = s.length()-1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        System.out.println("Stringa stampata al rovescio: " +s1);

    }

    public static void soloConsonanti(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i': 
                case 'o': 
                case 'u':
                    s1 += s.charAt(i);
            }
        }

        System.out.println("Stampa delle sole vocali: " +s1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Inserire una stringa");
        
        String s = in.nextLine();

        stampaReverse(s);

        soloConsonanti(s);

        //StringBuffer str = new StringBuffer();

        boolean flag = true;

        int lunghezza = 0;
       
        System.out.println("Inserire una sequenza di stringhe terminate con la stringa vuota");

        do {
            String input = in.nextLine();
            if (!input.isEmpty()) {
                char c = input.charAt(0);
                if (Character.isUpperCase(c))
                    lunghezza += input.length();
            }
            else
                flag = false;
        } while (flag);


        System.out.println("Lunghezza totale delle stringhe che iniziano per maiuscola: " + lunghezza);
    }
}