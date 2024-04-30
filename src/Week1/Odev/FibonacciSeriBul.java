package Week1.Odev;
import java.util.Scanner;

// Fibonacci serisinin eleman sayısını kullanıcıdan alıp, ekrana fibonacci serisini yazdıran program.
public class FibonacciSeriBul {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int num = scanner.nextInt();

        /* İlk 2 fibonacci rakamını değişkene atıyoruz. Döngü içerisinde 2 değişkenin toplama işlemi
           gerçekleştiriliyor. İlk değişkene 2. değişken atanıyor ve toplam da 2. değişkene atanıyor. */

        int fib1 = 0, fib2 = 1;
        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < num; i++) {
            System.out.print(fib1 + " ");
            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }
    }
}
