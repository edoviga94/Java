import java.util.Scanner;
public class Esercizio1 {

    public static void stampaArray(int[] a) {

        System.out.println("\nStampa dell'array");
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("]\n");


    }


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire la dimensione dell'array");
        int dim = keyboard.nextInt();

        int[] array = new int[dim];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*50);
        }

        stampaArray(array);
       
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    flag = true;
                }
            }

            if(!flag)
                break;
        }

        System.out.println("Array ordinato");
        stampaArray(array);

    }
}