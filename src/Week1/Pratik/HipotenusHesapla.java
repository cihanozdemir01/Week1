package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan dik kenarlarının uzunluğunu alan
 ve hipotenüsü hesaplayan program. */

public class HipotenusHesapla {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double a,b,c,Sonuc;

// Kullanıcıdan veriler alınır.

        System.out.print("Lütfen dik kenarlardan bir tanesinin uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("Lütfen dik kenarlardan diğerinin uzunluğunu giriniz: ");
        b = input.nextDouble();

// Girilen uzunlukların kareleri alınıp toplanır.

        c=Math.pow(a,2) + Math.pow(b,2);

// Hipotenüsü elde etmek için de toplanan sayının karekökü alınır.

        Sonuc = Math.sqrt(c);

        System.out.print("Bu dik üçgenin hipotenüsü = " + Sonuc );
    }
}
