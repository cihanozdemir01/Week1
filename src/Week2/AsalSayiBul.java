package Week2;
import java.util.Scanner;

// Girilen sayının asal olup/olmadığını bulan program.
public class AsalSayiBul {
    static String prime(int a){

        boolean check=false;

        for(int i=2; i<a; i++){
            if( a % i == 0) {
                check=true;
                break;
            }
        }
        if (check){
            return "Asal sayı değil";
        }else{
            return "Asal sayı";
        }
    }
    public static void main(String[] args) {

        System.out.print("Sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(prime(num));

    }
}
