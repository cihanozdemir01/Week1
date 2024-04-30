package Week2;
import java.util.Scanner;

// Kullanıcıdan alınan sayı ve üs değerine göre sayının üssünü hesaplayan program.

public class UsAlma {

    /* Kuulanıcıdan alınacak 2 değer fonksiyonda işleme girer.
       Oluşturulan döngü kullanıcının girdiği üs değeri kadar döndürülür.
       Her seferinde kullanıcının girdiği sayı değeri kendisi ile çarpılır.
       Ve sayı bir sonuç değişkenine atanır. */

    static int pow(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }
    public static void main(String[] args) {

        // Kullanıcıdan sayı ve üs değerleri alınır.
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int a = scan.nextInt();

        System.out.print("Üssü giriniz : ");
        int b = scan.nextInt();

        System.out.println(a + " sayısının " + b + ". üssü : "+ pow(a,b));

    }
}
