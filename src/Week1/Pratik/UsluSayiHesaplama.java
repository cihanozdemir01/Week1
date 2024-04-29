package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan sayı ve üs alınarak sonucu bulan program.
public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int num, exp;
        int total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        num = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz : ");
        exp = input.nextInt();

        // Döngü oluşturulur. Ve girilen üs sayısına kadar girilen sayı ile çarpım bir değişkene atanır.

        for (int i=1; i<=exp; i++ ) {
            total*=num;
        }

        System.out.println(total);
    }
}
