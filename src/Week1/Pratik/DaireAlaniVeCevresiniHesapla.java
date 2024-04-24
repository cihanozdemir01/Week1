package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan alınan yarı çapı verisi ile
dairenin alanını ve çevresini hesaplayan program. */

public class DaireAlaniVeCevresiniHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r,daireAlani,daireCevresi;
        final double pi = 3.14;

// Kullanıcıdan yarı çap verisi alınır.

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

// Daire alanı ve çevresi hesaplattırılır.

        daireAlani = pi * Math.pow(r,2);
        daireCevresi = 2 * pi * r;

        System.out.println("Dairenin Alanı = " + daireAlani);
        System.out.println("Dairenin Çevresi = " + daireCevresi);

    }
}
