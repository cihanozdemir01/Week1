package Week1.Pratik;
import java.util.Scanner;

/* Gidilen mesafeye (KM) göre taksimetre
tutarını ekrana yazdıran program.  */
public class TaksimetreProgrami {
    public static void main(String[] args) {

        // Sabit veriler tanımlanır ve kullanıcıdan ilgili veriler alınır.
        Scanner input = new Scanner(System.in);
        int minimumTutar=20;
        int acilisUcreti = 10;
        double gidilenMesafe, Ucret;
        double kilometreUcreti = 2.20;

        System.out.print("Lütfen gidilen mesafeyi (KM) giriniz : ");
        gidilenMesafe = input.nextDouble();

        // Gidilen mesafeye göre ücret hesaplanır.
        Ucret = gidilenMesafe * kilometreUcreti + acilisUcreti;

        // Kullanıcıya şarta bağlanan ifade ile toplam ödemesi gereken tutar gösterilir.
        if (Ucret>20){
            System.out.print("Ödenmesi gereken tutar = " + Ucret +  " TL'dir.");
        } else {
            System.out.println("Ödenmesi gereken tutar = " + minimumTutar + " TL'dir.");
        }
    }
}
