package Week1.Odev;
import java.util.Scanner;

// Kullanıcıdan alınan yıl verisine göre artık yıl sorgusunu yapan program.
public class ArtikYilHesapla {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        // Sayı 400'e tam bölünebiliyorsa artık yıldır.4'e tam bölünüp 100'e tam bölünemiyorsa da artık yıldır.,
        // Aksi durumda artık yıl değildir.
        if ( year % 400 == 0) {
            System.out.println( year + " Artık bir yıldır !");
        } else if ( year % 4 == 0 && year % 100 !=0) {
            System.out.println(year + " Artık bir yıldır !");
        } else {
            System.out.println("Artık bir yıl değildir !");
        }
    }
}
