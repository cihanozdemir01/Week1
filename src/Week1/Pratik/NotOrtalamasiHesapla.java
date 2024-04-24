package Week1.Pratik;
import java.util.Scanner;

/* Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp
ekrana bastıran program. */

public class NotOrtalamasiHesapla {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int Matematik,Fizik,Kimya, Turkce,Tarih,Muzik;

        // Sınav notları kullanıcıdan alınır.
        System.out.print("Matematik dersi notunu giriniz : ");
        Matematik = input.nextInt();
        System.out.print("Fizik dersi notunu giriniz : ");
        Fizik = input.nextInt();
        System.out.print("Kimya dersi notunu giriniz : ");
        Kimya = input.nextInt();
        System.out.print("Türkçe dersi notunu giriniz : ");
        Turkce = input.nextInt();
        System.out.print("Tarih dersi notunu giriniz : ");
        Tarih = input.nextInt();
        System.out.print("Müzik dersi notunu giriniz : ");
        Muzik = input.nextInt();

        // Sınav notlarının ortalaması hesaplattırılır.
        double notOrtalamasi = (double) (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik)/6;

        // Sınıfı geçip geçmeme durumu not ortalaması sonucuna göre şarta bağlanır.
        String sonuc = notOrtalamasi > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);

    }
}