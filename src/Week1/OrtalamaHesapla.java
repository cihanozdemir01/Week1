package Week1;
import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplamPuan = 0;
        int gecerliDersSayisi = 0;
        int dersGecmeNotu = 55;

        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Müzik"};

        // Kullanıcıdan derslerin puanları alınır.
        for (int i = 0; i < 5; i++) {
            System.out.print(dersler[i] + " dersi puanını giriniz : ");
            int puan = scanner.nextInt();

            //Eğer alınan puanlar 0'dan küçük ya da 100'den büyükse uyarı yapılır ve ortalamaya girmez.
            if (puan >= 0 && puan <= 100) {
                toplamPuan += puan;
                gecerliDersSayisi++;
            } else {
                System.out.println("Geçersiz puan! 0 ile 100 arasında olmalıdır.");
            }
        }
        //Geçerli ders sayısı 0'dan büyükse ortalama hesaplanır.
        if (gecerliDersSayisi > 0) {
            double ortalama = (double) toplamPuan / gecerliDersSayisi;
            String sonuc = ortalama > dersGecmeNotu ? "Sınıfı geçtiniz. Başarılar" : "Sınıfta kaldınız.";
            System.out.println("Ortalamanız = " + ortalama + "---" + sonuc);
        } else {
            System.out.println("Geçerli ders bulunamadı.");
        }
    }
}
