package Week1.Pratik;
import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input= new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama işleminizin sonucu");
                System.out.println("--------------------------");
                System.out.print(n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminizin sonucu");
                System.out.println("--------------------------");
                System.out.print(n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case 3:
                System.out.println("Bölme işleminizin sonucu");
                System.out.println("------------------------");
                System.out.print(n1 + " / " + n2 + " = " + (n1/n2));

                break;
            case 4:
                System.out.println("Çarpma işleminizin sonucu");
                System.out.println("-------------------------");
                System.out.print(n1 + " x " + n2 + " = " + (n1*n2));
                break;
        }



    }
}
