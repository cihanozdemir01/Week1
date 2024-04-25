package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan alınan yarı çap ve merkez açı ölçüsü verisi ile daire alanı, çevresi
ve daire parçasının alanını hesaplayan program. */
public class DaireAlaniVeCevresiniHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;
        double r,daireAlani,daireCevresi;
        final double pi = 3.14;

        // Kullanıcıdan yarı çap verisi alınır.
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Lütfen merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();


        // Daire alanı ve çevresi hesaplattırılır.
        daireAlani = pi * Math.pow(r,2);
        daireCevresi = 2 * pi * r;

        System.out.println("Dairenin Alanı = " + daireAlani);
        System.out.println("Dairenin Çevresi = " + daireCevresi);

        //  Daire parçasının alanı hesaplanır.
        double daireParcaAlani = ( pi * (r * r) * a)/360;

        System.out.print("Daire parçasının alanı = " + daireParcaAlani);
    }
}
