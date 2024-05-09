package Week2;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matris boyutlarını alır
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int columns = scanner.nextInt();

        // Kullanıcıdan matris girdilerini alır
        int[][] matrix = new int[rows][columns];
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu bulur
        int[][] transposeMatrix = findTranspose(matrix);

        // Transpoz matrisini yazdırır
        System.out.println("Matris:");
        printMatrix(matrix);
        System.out.println("\nTranspoz Matris:");
        printMatrix(transposeMatrix);

        scanner.close();
    }

    // Matrisin transpozunu bulan metot
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Transpoz matrisin boyutları değiştirilir
        int[][] transposeMatrix = new int[columns][rows];

        // Matrisin transpozunu bulur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Matrisi yazdıran metot
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
