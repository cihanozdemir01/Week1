package Week1.Pratik;
import java.util.Scanner;

// Kullanıcı tarafından girilen sayıya kadar 4 ve 5'in katlarını bulan program.
public class SayiKuvvetiBulma {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        /* Önce girilen sayıya kadar bir döngü oluşturdum.
           Sonra her bir iterasyona kadar 4 ve 5'in katlarına eşitliği sorguladım.
           Ve eşitliği sağladığımda değerleri yazdırdım. */

        for (int i=1; i<n; i++){
            for (int y=1; y<i; y++){
                if (i == Math.pow(4,y)){
                    System.out.println(i + " - 4'ün " + y +". kuvveti" );
                }
                if (i == Math.pow(5,y)){
                    System.out.println(i + " - 5'in " + y +". kuvveti" );
                }
            }
        }
    }
}
