package Week2;
import java.util.Scanner;

// A program that performs calculator operations with 2 numbers obtained from the user.
public class Calculator {
    // Classes are defined for the operations.
    public static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    public static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }
    public static int multiple(int a, int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }
    public static double division(int a, int b){
        if (b==0){
            System.out.println("İkinci sayı sıfırdan farklı olmalı");
            return 0;
        }
        double result = (double) a / b;
        System.out.println("Bölme : " + result);
        return result;
    }
    public static int pow(int a, int b){
        if ( b == 0){
            return 1;
        }
        return a * pow(a,b-1);
    }
    public static int mod(int a, int b){
        if (b==0){
            System.out.println("İkinci sayı sıfırdan farklı olmalı");
            return 0;
        }
        int result = a % b;
        System.out.println("Mod Alma : " + result);
        return result;
    }
    public static int areaAndPerimeterCalc(int a, int b){
        int resultAreaCalc = a * b;
        int resultPerimeterCalc= 2 * (a +b);
        System.out.println("Alan Hesabı : " + resultAreaCalc + "\nÇevre Hesabı : "
                            + resultPerimeterCalc );
        return resultAreaCalc + resultPerimeterCalc;
    }
    public static void main(String[] args) {
        // The user is shown a menu and numbers are taken.
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama İşlemi\n"
                + "6 - Mod Alma İşlemi\n"
                + "7 - Dikdörtgen Alan ve Çevre Hesap İşlemi\n"
                + "8 - Çıkış Yap\n";
        while (true) {
            System.out.println("      MENÜ \n" + "------------------\n" + menu);
            System.out.print("Bir işlem seçiniz : ");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("Bir sayı giriniz : ");
            int a = inp.nextInt();
            System.out.print("Bir sayı giriniz : ");
            int b = inp.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    multiple(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    System.out.println("Üs Alma : " +pow(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    areaAndPerimeterCalc(a,b);
                default:
                    System.out.println("Geçersiz bir işlem girdiniz !");
            }
        }
    }
}

