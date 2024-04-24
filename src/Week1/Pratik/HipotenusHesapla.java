package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan dik kenarlarının uzunluğunu alan
 ve hipotenüsü hesaplayan program. */

public class HipotenusHesapla {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double a,b,c,Toplam;

// Kullanıcıdan veriler alınır.

        System.out.print("Lütfen dik kenarlardan bir tanesinin uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("Lütfen dik kenarlardan diğerinin uzunluğunu giriniz: ");
        b = input.nextDouble();

// Girilen uzunlukların kareleri alınıp toplanır.

        Toplam = Math.pow(a,2) + Math.pow(b,2);

// Hipotenüsü elde etmek için de toplanan sayının karekökü alınır.

        c = Math.sqrt(Toplam);

// Tüm uzunlukları bilinen üçgenin alanı hesaplanır.

        double ucgenCevresi = a + b + c;
        double u = ucgenCevresi / 2;
        double ucgenAlani = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı = " + ucgenAlani );
    }
}
