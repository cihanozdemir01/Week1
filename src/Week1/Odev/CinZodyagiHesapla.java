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
                System.out.print("Maymun");
                break;
            case 1:
                System.out.print("Horoz");
                break;
            case 2:
                System.out.print("Köpek");
                break;
            case 3:
                System.out.print("Domuz");
                break;
            case 4:
                System.out.print("Fare");
                break;
            case 5:
                System.out.print("Öküz");
                break;
            case 6:
                System.out.print("Kaplan");
                break;
            case 7:
                System.out.print("Tavşan");
                break;
            case 8:
                System.out.print("Ejderha");
                break;
            case 9:
                System.out.print("Yılan");
                break;
            case 10:
                System.out.print("At");
                break;
            case 11:
                System.out.print("Koyun");
                break;
        }
    }
}

