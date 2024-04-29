package Week1.Odev;
import java.util.Scanner;

// Kullanıcıdan alınan sayının mükemmel olup/olmadığını bulan program.
public class MukemmelSayi {
    public static void main(String[] args) {

        int num,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        num = input.nextInt();

        /* Kullanıcıdan alınan sayıya kadar bir döngü oluşturulur
           ve kalansız bölünebilen sayılar toplanır. */
        for ( int i = 1; i<num; i++){
            if (num % i == 0){
                sum+=i;
            }
        }
        // Eğer toplam, kullanıcıdan alınan sayı eşit ise koşulu düzenlenir.
        if (sum == num) {
            System.out.println(num + " Mükemmel sayıdır.");
        }else{
            System.out.println(num + " Mükemmel sayı değildir.");
        }
    }
}
