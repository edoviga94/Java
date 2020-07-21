public class Esercizio1 {


    public static void stampaArray(int[] array) {

        System.out.println("Stampa normale dell'array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    public static void checkPos(int[] array) {
        System.out.println("Stampa dell'array alternata:");

        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i]);
            System.out.println(array[array.length - i - 1]);
        }

    }

    public static void EvenOdd(int[] array) {
        int sommaPari = 0;
        int sommaDispari = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                sommaPari += array[i];
            else
                sommaDispari += array[i];
        }

        if (sommaPari == sommaDispari)
            System.out.println("Pari e Dispari uguali");
        else
            System.out.println("Pari e Dispari diversi");
    }

    public static void consecutiveValue(int[] array) {

        boolean flag = false;
        for (int i = 0; i < array.length - 4; i++) {
            if (i == array[i++] && array[i++] == array[i + 2]) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Tre valori consecutivi uguali");
        else
            System.out.println("NO");

    }


    public static void checkString(String[] s1, String[] s2) {

        boolean flag = false;

        for (int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) 
            System.out.println("OK");
        else
        System.out.println("KO");
    }



    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        stampaArray(array);

        System.out.println();

        checkPos(array);

        System.out.println();

        EvenOdd(array);

        System.out.println();

        consecutiveValue(array);

        System.out.println();

        String[] str1 = {"lorem", "ipsum", "prova", "ciao", "pippo"};

        String[] str2 = {"unimib", "paolino", "paperino", "ipsum", "313"};

        String[] str3 = { "ASD", "AD", "A", "D", "W" };

        checkString(str1, str2);

        System.out.println();

        checkString(str1, str3);



    }
}