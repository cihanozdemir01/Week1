package Week1.Pratik;
import java.util.Scanner;

public class HarmonikSeriBul {
    public static void main(String[] args) {

        int i, num;
        double result=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        for ( i=1; i <= num; i++){
            result += (1.0/i);
        }

        System.out.println("Sonuç : " + result);
    }
}
