package Week1.Pratik;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir tam sayı girin : ");
        int tamSayi=inp.nextInt();

        System.out.print("Bir ondalıklı sayı girin : ");
        double ondalikliSayi=inp.nextDouble();

        System.out.println();
        System.out.println("Type Casting Yapmadan Önce");
        System.out.println("---------------------------");
        System.out.print("Tam Sayı : " + tamSayi + " - Ondalık Sayı : " + ondalikliSayi );
        System.out.println();

        double donOndalikliSayi = tamSayi;
        int donTamSayi = (int) ondalikliSayi;

        System.out.println();
        System.out.println("Type Casting Yaptıktan Sonra");
        System.out.println("---------------------------");
        System.out.print("Tam Sayı : " + donOndalikliSayi + " - Ondalık Sayı : " + donTamSayi );
        System.out.println();
    }
}
