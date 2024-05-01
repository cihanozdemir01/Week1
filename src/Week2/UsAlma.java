package Week2;
import java.util.Scanner;

// Kullanıcıdan alınan sayı ve üs değerine göre sayının üssünü hesaplayan program.

public class UsAlma {

    /*  Metot üs değeri 1 eksiltilerek tekrar çağırılır ve üs değeri sıfır olana
        kadar çağırılır. Üs değeri 0 olunca 1 değeri döndürülür. Ve sırası ile
        taban değeri ile çarpılarak sonuç elde edilir.*/

    static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {

        // Kullanıcıdan sayı ve üs değerleri alınır.
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int a = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b = scan.nextInt();

        System.out.println("Sonuç : "+ pow(a,b));

    }
}
