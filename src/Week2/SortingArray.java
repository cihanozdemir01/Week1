package Week2;
import java.util.Scanner;
import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int num = scanner.nextInt();
        System.out.println();

        int[] array = new int[num];

        System.out.println("Dizinin elemanlarını giriniz");
        System.out.println("----------------------------");
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Sıralama: ");
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
