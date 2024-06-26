package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcının manavdan almış olduğu ürünlerin kilogram
değerine göre toplam tutarı ekrana yazdıran program. */
public class ManavKasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fiyatArmut, fiyatElma, fiyatDomates, fiyatMuz, fiyatPatlican;
        double kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican;
        double toplamTutar;

        // Fiyat değişkenlerine değerler atanır.
        fiyatArmut = 2.14;
        fiyatElma = 3.67;
        fiyatDomates = 1.11;
        fiyatMuz = 0.95;
        fiyatPatlican = 5.00;

        // Kullanıcıdan kilogram verileri alınır.
        System.out.print("Armut Kaç Kilo ? : ");
        kiloArmut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        kiloElma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        kiloDomates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        kiloMuz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        kiloPatlican = input.nextDouble();

        // Alınan veriler ile toplam tutar hesaplanır.
        toplamTutar = (fiyatArmut * kiloArmut) + (fiyatElma * kiloElma) +
                      (fiyatDomates * kiloDomates) + (fiyatMuz * kiloMuz) +
                      (fiyatPatlican * kiloPatlican);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }
}
