package Week1.Odev;
import java.util.Scanner;

// Kullanıcıdan alınan sayıya göre ters üçgen oluşturan program.
public class TersUcgen {
    public static void main(String[] args) {

        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num = inp.nextInt();

        /* Ters üçgen oluştururken bir bağıntı bulmak gerekiyor. Burada da "2*(num-i)-1"
           bağıntısı bulunarak işlem gerçekleştirilmiştir. */
        for (int i=0; i<num; i++) {
            for (int y=0; y<2*(num-i)-1;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
