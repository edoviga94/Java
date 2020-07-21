import java.util.Scanner;

public class Esercizio2 {




    public static boolean isPalindroma(String s) {

         boolean result = true;

        for(int i = 0; i < s.length()/2; i++) {

            if(s.charAt(i) == ' ')
                continue;

            if(s.charAt(i) != s.charAt(s.length()-i-1))
                result = false;
        }
        // System.out.print(s.charAt(s.length()-1));

        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Inserire una stringa:");

        String s = keyboard.nextLine();

        System.out.println("La stringa e' palindroma? "+isPalindroma(s));
    }
}