package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan sayıya göre üçgen oluşturma
public class UcgenYildiz {
    public static void main(String[] args) {

        int i,y,j,num;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        num = input.nextInt();

        // İç içe döngü oluşturarak boşluk ve karakter dizilimleri sağlanır.
        for (i=1; i<=num; i++){
            for(y=1; y<=(num-i); y++){
                System.out.print(" ");
            }
            for(j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
