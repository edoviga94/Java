import java.util.Scanner;
public class Esercizio4 {

    public static void stampaMatrice(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }

            System.out.println();
        }

    }



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Inserire le dimensioni della matrice:");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();

        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = (int)(Math.random()*20);
            }
        }
        System.out.println("\nMatrice originale");
        stampaMatrice(matrix);

        int[][] matrixT = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }

        System.out.println("\nMatrice Trasposta");
        stampaMatrice(matrixT);
    }
}