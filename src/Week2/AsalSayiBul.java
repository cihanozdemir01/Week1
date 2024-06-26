package Week2;
import java.util.Scanner;

// Girilen sayının asal olup/olmadığını bulan program.
public class AsalSayiBul {

    // Recursive metot oluşturulur. Sayı 2'den küçük olamaz.
    // Divisor değişkeni 1'e eşitse sayı 2'dir ve asaldır.
    // n değişkeninin modu 0 ise sayı asal değildir.
    static boolean isPrime(int n, int divisor) {
        if (n < 2)
            return false;
        if (divisor == 1)
            return true;
        if (n % divisor == 0)
            return false;
        return isPrime(n, divisor - 1);
    }
    public static void main(String[] args) {
        System.out.print("Sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (isPrime(num, num / 2))
            System.out.println(num + " bir asal sayıdır.");
        else
            System.out.println(num + " bir asal sayı değildir.");
    }
}
