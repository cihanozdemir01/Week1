package Week1.Odev;
import java.util.Scanner;

// Mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan program.
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        //Değişkenler tanımlanır, mesafe ücretine ve indirim oranlarına sabit bir değer atanır.
        Scanner input = new Scanner(System.in);
        double mesafeUcreti = 0.1;
        double yasIndirimi = 0, yolculukTipiIndirimi = 0;
        double yasIndirimOrani12 = 0.5;
        double yasIndirimOrani1224 = 0.1;
        double yasIndirimOrani65 = 0.3;
        double yolculukTipiIndirimOrani = 0.2;

        //Kullanıcıdan uçuş mesafesi, yaşı ve yolculuk tipi verisi alınır.
        System.out.print("Mesafeyi km türünden giriniz : ");
        int ucusMesafesi = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int yolcuYasi = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 =>Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        //Uçuş mesafesi ve yolcu yaşının pozitif olması ile yolculuk tipinde 2 alternatiften birinin gerçekleşmesi durumu koşula bağlanır.
        if ((ucusMesafesi > 0 && yolcuYasi > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {

            ////////////////////////////////             SENARYO 1                //////////////////////////////////
            //Yaş indiriminde yolcuya "<12" ise ücretin %50 oranında, "12< <24" ise ücretin %90 oranında, ">65" ise ücretin %70 oranında indirim uygulanacak.
            //Yolculuk tipi indirimi tek yön ise indirim yok. Gidiş dönüş ise %80 oranında indirim olacak. Ancak 2 bilet gibi düşünmek gerekiyor toplam tutarı bulurken.
            yasIndirimi = yolcuYasi < 12 ? (1 - yasIndirimOrani12) : yolcuYasi < 24 ? (1 - yasIndirimOrani1224) : yolcuYasi > 65 ? (1 - yasIndirimOrani65) : 1;
            yolculukTipiIndirimi = yolculukTipi == 1 ? 1 : 2 * (1 - yolculukTipiIndirimOrani);
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }

        double biletFiyati = mesafeUcreti * ucusMesafesi * yasIndirimi * yolculukTipiIndirimi;
        System.out.println("Toplam Tutar =" + biletFiyati + " TL");

    }
}