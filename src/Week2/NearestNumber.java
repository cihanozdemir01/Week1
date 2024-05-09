package Week2;
import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = scanner.nextInt();

        Arrays.sort(list);

        int nearestSmaller = Integer.MIN_VALUE;
        int nearestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > nearestSmaller) {
                nearestSmaller = i;
            }
            if (i > number && i < nearestLarger) {
                nearestLarger = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + nearestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + nearestLarger);
    }
}
        

