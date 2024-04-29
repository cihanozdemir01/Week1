package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan n sayıdan en büyük ve en küçük sayıyı bulan program.
public class EnBuyukVeEnKucukSayi {
    public static void main(String[] args) {

        int n,number,number1,number2;
        int max,min;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        // Kullanıcıdan en az 2 sayı alınarak büyük ve küçük değerler bulunur.
        System.out.print("1. sayıyı giriniz : ");
        number1= input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        number2= input.nextInt();

        if (number1<number2){
            max=number2;
            min=number1;
        }else{
            min=number2;
            max=number1;
        }
        /* Daha sonra kullanıcıdan 3. sayıdan başlayarak talep ettiği sayıya kadar
           alınarak en büyük ve en küçük sayılar belirlenir.*/

        for (int i=3; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz : ");
            number=input.nextInt();

            if (number<min){
                min=number;
            }

            if(number>max){
                max=number;
            }
        }
        System.out.println(n + " adet sayı içerisinden minimum sayı : " + min);
        System.out.print(n + " adet sayı içerisinden maksimum sayı : " + max);
    }
}
