package Week1.Pratik;
import java.util.Scanner;

// 0'dan başlayarak kullanıcıdan aldığı sayıya kadar
// 3 ve 4'e bölünebilen sayıların ortalamasını bulan program.
public class BolunebilenSayiOrtalamasi {
    public static void main(String[] args) {

        int toplam, i, j, girilenSayi;
        double ortalama;
        toplam=0;
        j=0;

        //Kullanıcıdan veri alınır.
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        girilenSayi = input.nextInt();

        //0'dan girilen sayıya kadar bir döngü oluşturulur.
        //3 ve 4'e bölünebilen sayılar toplanır. Kaç adet oldukları da bulunur.
        for(i=0; i<girilenSayi; i++){
            if (i % 3 ==0 && i % 4==0){
                toplam+=i;
                j++;
            }
        }
        //Hesaplama işlemi gerçekleştirilir.
        ortalama = (double) toplam / j;
        System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması :" + ortalama);
    }
}
