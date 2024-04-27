package Week1.Pratik;
import java.util.Scanner;


// Kullanıcıdan doğduğu ay ve gün verisi alınarak burcunu bulan program.
public class BurcBulanProgram {
    public static void main(String[] args) {

        int month, day;
        String burc="";

        // Kullanıcıdan doğduğu ay ve gün verisi alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        if ( month == 1) burc = 1 <= day && day <= 21 ? "Oğlak" : 21<day && day<=31 ? "Kova":"Hatalı Giriş";
        if ( month == 2) burc = 1 <= day && day <= 19 ? "Kova" : 19<day && day<=28 ? "Balık":"Hatalı Giriş";
        if ( month == 3) burc = 1 <= day && day <= 20 ? "Balık" : 21<day && day<=31 ? "Koç":"Hatalı Giriş";
        if ( month == 4) burc = 1 <= day && day <= 21 ? "Koç" : 21<day && day<=30 ? "Boğa":"Hatalı Giriş";
        if ( month == 5) burc = 1 <= day && day <= 21 ? "Boğa" : 21<day && day<=31 ? "İkizler":"Hatalı Giriş";
        if ( month == 6) burc = 1 <= day && day <= 22 ? "İkizler" : 22<day && day<=30 ? "Yengeç":"Hatalı Giriş";
        if ( month == 7) burc = 1 <= day && day <= 22 ? "Yengeç" : 22<day && day<=31 ? "Aslan":"Hatalı Giriş";
        if ( month == 8) burc = 1 <= day && day <= 22 ? "Aslan" : 22<day && day<=31 ? "Başak":"Hatalı Giriş";
        if ( month == 9) burc = 1 <= day && day <= 23 ? "Başak" : 23<day && day<=30 ? "Terazi":"Hatalı Giriş";
        if ( month == 10) burc = 1 <= day && day <= 23 ? "Terazi" : 23<day && day<=31 ? "Akrep":"Hatalı Giriş";
        if ( month == 11) burc = 1 <= day && day <= 22 ? "Akrep" : 22<day && day<=30 ? "Yay":"Hatalı Giriş";
        if ( month == 12) burc = 1 <= day && day <= 21 ? "Yay" : 21<day && day<=31 ? "Oğlak":"Hatalı Giriş";

        System.out.println(burc);
    }
}
