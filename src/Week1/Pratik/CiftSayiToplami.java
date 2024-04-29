package Week1.Pratik;
import java.util.Scanner;

/* Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
   girilen değerlerden çift ve
   4'ün katları olan sayıları toplayan program. */
public class CiftSayiToplami {
    public static void main(String[] args) {

        int n, total=0;
        Scanner input = new Scanner(System.in);

        /* Kullanıcıdan sayı alınır ve if sorgusunda 4'e bölünebilme kuralı uygulanır.
           sonrasında while sayesinde de tek olana kadar döngü çalıştırılır. */
        do {
            System.out.print("Sayı giriniz : ");
            n = input.nextInt();
            if ( n % 4 == 0){
                total+=n;
            }

        } while(n % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
