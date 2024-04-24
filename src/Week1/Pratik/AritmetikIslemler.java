package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan 3 tane sayı (a, b, c) alıp, bu sayıları işlem sırasına
   göre işleyen program. */

public class AritmetikIslemler {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input=new Scanner(System.in);

// Kullanıcıdan veriler alınır.

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        b= input.nextInt();
        System.out.print("Lütfen 3. sayıyı giriniz: ");
        c= input.nextInt();

// Kullanıcıdan alınan verilerle işlem gerçekleştirilir.

        int Islem= a+b*c-b;

        System.out.println("İşleminizin sonucu = " + Islem);
    }
}
