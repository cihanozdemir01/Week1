package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan sıcaklık derecesine göre etkinlik önerisinde bulunan program.
public class EtkinlikOner {
    public static void main(String[] args) {

        int heat;
        String etkinlik;

        //Kullanıcıdan sıcaklık değeri alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz = ");
        heat = input.nextInt();

        //Ternary operatörü kullanarak derece aralıklarına göre etkinlikleri düzenledim.
        etkinlik = heat>=25 ? "Yüzmeye gidebilirsin" : heat>=15 ?
                "Pikniğe gidebilirsin" : heat>=10 ? "Pikniğe gidebilirsin" + " " +
                "Sinemaya gidebilirsin" : heat>=5 ? "Sinemaya gidebilirsin" :
                "Kayak yapabilirsin";

        System.out.println(etkinlik);
    }
}

