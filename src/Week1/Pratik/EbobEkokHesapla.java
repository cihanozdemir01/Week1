package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan 2 sayının EBOB'u ve EKOK'unu hesaplayan program.
public class EbobEkokHesapla {
    public static void main(String[] args) {

        int i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob=1;
        int ekok=1;

        while(i<n1 && i<n2){
            if (n1 % i == 0 && n2 % i == 0){
                ebob=i;
            }
            i++;
        }
        System.out.println(n1 + " ve " + n2 + " sayısının EBOB'u : " + ebob);

        while(i<(n1*n2)){
            if (i % n1 == 0 && i % n2 == 0){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println(n1 + " ve " + n2 + " sayısının EKOK'u : " + ekok);
    }
}
