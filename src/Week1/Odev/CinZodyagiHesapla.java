package Week1.Odev;
import java.util.Scanner;

// Kullanıcıdan aldığı doğum tarihi bilgisi ile Çin Zodyağı hesaplayan program.
public class CinZodyagiHesapla {
    public static void main(String[] args) {

        int birthDate;

        // Kullanıcıdan veri alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum tarihinizi giriniz : ");
        birthDate = input.nextInt();

        // Çin Zodyağı hesabı için doğum tarihinin 12'ye bölümünden kalan değişkene atanır.
        String burc = switch (birthDate % 12) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "";
        };
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}

