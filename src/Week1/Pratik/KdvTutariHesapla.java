package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan alınan para değerinin KDV'li fiyatını
 ve KDV tutarını hesaplayıp ekrana bastıran program.
 Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
 tutar 1000 TL'den büyük ise KDV oranı %8 olarak KDV tutarı  hesaplanır.
 */
public class KdvTutariHesapla {
    public static void main(String[] args) {

    double kullaniciParasi, Tutar, kdvTutari;

    Scanner input=new Scanner(System.in);

// Kullanıcıdan veriler alınır.

    System.out.print("Lütfen tutar giriniz: ");
    kullaniciParasi = input.nextDouble();

    if (kullaniciParasi>0 & kullaniciParasi<1000) {

        Tutar = kullaniciParasi+kullaniciParasi * 0.18;
        kdvTutari = Tutar - kullaniciParasi;

    } else {

        Tutar = kullaniciParasi+kullaniciParasi * 0.08;
        kdvTutari = Tutar - kullaniciParasi;
    }

        System.out.println("KDV'siz fiyat = " + kullaniciParasi);
        System.out.println("KDV'li fiyat = " + Tutar);
        System.out.println("KDV tutarı = " + kdvTutari);

    }
}

