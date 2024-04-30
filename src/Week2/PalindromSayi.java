package Week2;
import java.util.Scanner;
// Kullanıcıdan alınan sayının palindrom sayı olup/olmadığını bulan program.
public class PalindromSayi {
    // Palindrom sayı kontrolü için metot tanımlanır.
    static boolean isPalindrom(int number){
        int temp=number, reverseNumber=0, lastNumber;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/=10;
        }
        if (number == reverseNumber){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // Kullanıcıdan veri alınır.
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num = inp.nextInt();
        if (isPalindrom(num)){
            System.out.println(num + " Palindrom sayıdır.");
        }else{
            System.out.println(num + " Palindrom sayı değildir.");
        }
    }
}
