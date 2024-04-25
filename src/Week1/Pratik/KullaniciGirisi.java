package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan şifre isteyen, şifrenin doğruluğu denetleyen veS hatalı
ise yeni şifre oluşturulmasını sağlayan program. */
public class KullaniciGirisi {
    public static void main(String[] args) {

        // Değişken tanımlamaları ve kullanıcı şifre değişkenine atama yapılır.
        int kullaniciSifre, yeniSifre, girilenSifre, Cevap;
        kullaniciSifre = 1234;

        //Kullanıcıdan şifre girişi istenir.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        girilenSifre = input.nextInt();

        //Kullanıcının girdiği şifre ile sistemdeki kayıtlı şifre kontrol edilir.
        if (girilenSifre == kullaniciSifre){
            System.out.println("Giriş gerçekleştirildi");
        } else {

            //Şifre hatalı ise bu blok çalışır ve şifre sıfırlama istenip istenmediği kullanıcıya sorulur.
            System.out.print("Şifrenizi yanlış girdiniz. Sıfırlamak ister misiniz? Yes(1)/No(2) = ");
            Scanner input2 = new Scanner(System.in);
            Cevap = input2.nextInt();

            //Şifrenin değiştirilmesi isteniyorsa yeni şifre talebi yapılır.
            if (Cevap == 1 ){
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                Scanner input3 = new Scanner(System.in);
                yeniSifre = input3.nextInt();

                //Kullanıcıdan alınan yeni şifre, eski şifreden farklı ya da doğru sayısal rakamlar olana kadar döngü çalıştırılır.
                while (yeniSifre == kullaniciSifre){
                   System.out.print("Şifre Oluşturulamadı (Eski şifrenizi ya da hatalı bir şifre girdiniz), lütfen başka şifre giriniz: ");
                   Scanner input4 = new Scanner(System.in);
                   yeniSifre = input4.nextInt();
                }
                System.out.println("Şifre oluşturuldu.");
            } else {
                System.out.println("Sisteme giriş gerçekleştirilemedi.");
            }
        }
    }
}
