package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan sayı alarak bu sayının harmonik serisini bulan program.
public class HarmonikSeriBul {
    public static void main(String[] args) {

        int i, num;
        double result=0;

        // Kullanıcıdan veri alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        // Kullanıcıdan alınan sayıya kadar bir döngü oluşturulur.
        // Ve işlem gerçekleştirilerek her seferinde toplam değişkenine atanır.
        for ( i=1; i <= num; i++){
            result += (1.0/i);
        }
        System.out.println("Sonuç : " + result);
    }
}
