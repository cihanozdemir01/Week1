package Week1.Odev;
import java.util.Scanner;

// Kullanıcıdan aldığı doğum tarihi bilgisi ile Çin Zodyağı hesaplayan program.
public class CinZodyagiHesapla {
    public static void main(String[] args) {

        int birthDate, cond;

        // Kullanıcıdan veri alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum tarihinizi giriniz : ");
        birthDate = input.nextInt();

        // Çin Zodyağı hesabı için doğum tarihinin 12'ye bölümünden kalan bir değişkene atanır.
        cond = birthDate % 12;

        switch(cond){
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz : Koyun");
                break;
        }
    }
}

