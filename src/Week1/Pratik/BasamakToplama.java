package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan sayının basamaklarını toplama.
public class BasamakToplama {
    public static void main(String[] args) {

        int number, sumDigit=0;
        int digitValue;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = input.nextInt();
        int tempNumber = number;

        while ( tempNumber != 0){
            tempNumber /= 10;
        }
        tempNumber=number;
        while (tempNumber!=0){
            digitValue = tempNumber % 10;
            sumDigit=sumDigit+digitValue;
            tempNumber/=10;
        }
        System.out.println(sumDigit);
    }
}
