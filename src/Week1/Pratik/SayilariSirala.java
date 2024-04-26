package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan 3 sayıyı sıralayan program.
public class SayilariSirala {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz = ");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz = ");
        b = input.nextInt();
        System.out.print("3. sayıyı giriniz = ");
        c = input.nextInt();

        //Sıralama işlemleri
        if ( a > b && b > c){
            System.out.println(a + ">" + b + ">" + c );
        } else if ( a > b && a > c ) {
            System.out.println(a + ">" + c + ">" + b);
        }
        if ( b > a && a > c){
            System.out.println(b + ">" + a + ">" + c );
        } else if ( b > a && b > c ) {
            System.out.println(b + ">" + c + ">" + a);
        }
        if ( c > a && a > b){
            System.out.println(c + ">" + a + ">" + b );
        } else if ( c > a && c > b ) {
            System.out.println(c + ">" + b + ">" + a);
        }
    }
}
