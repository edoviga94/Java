public class Esercizio3 {
    
    
    
    
    // public static void main(String[] args) {
    //     int n = 50;
    //     System.out.println("Stampa dei primi 50 numeri della serie di Fibonacci");

    //     for (int i = 0; i < 50; i++) {
            
    //     }
    // public static int fibonacci(int n) {
    //     if (n == 0)
    //         return 0;
    //     else if (n == 1)
    //         return 1;
    //     else {
    //         int f1 = fibonacci(n - 1);
    //         int f2 = fibonacci(n - 2);
    //         int ris = f1 + f2;
    //         return ris;
    //     }
    // }

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            long result;
            if(i <= 1) 
               result = i;
            else {
                long current = 1;
                long prev = 1;
                for (int j = 2; j < i; j++) {
                  long tmp = current;
                  current += prev;
                  prev = tmp;
                }
                result = current;
            }

            System.out.println(result);
        }   
    }
}