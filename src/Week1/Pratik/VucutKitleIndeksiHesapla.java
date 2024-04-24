package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan boy ve kilo değerlerini alıp;
"Vücut Kitle İndeks" değerini hesaplayan program. */

public class VucutKitleIndeksiHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Boy;
        double Kilo, Indeks;

// Kullanıcıdan boy ve kilo verileri alınır.

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        Boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        Kilo = input.nextDouble();

// Alınan veriler ile vücut kitle indeksi hesaplanır.

        Indeks= Kilo / Math.pow(Boy,2);

        System.out.println("Vücut Kitle İndeksiniz : " + Indeks);

    }
}
