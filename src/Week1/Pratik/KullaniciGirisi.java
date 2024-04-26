package Week1.Pratik;
import java.util.Scanner;

/* Kullanıcıdan şifre isteyen, şifrenin doğruluğu denetleyen ve hatalı
ise yeni şifre oluşturulmasını sağlayan program. */
public class KullaniciGirisi {
    public static void main(String[] args) {

        // Değişken tanımlamaları ve kullanıcı şifre değişkenine atama yapılır.
        String userPassword, newPassword, password, answer;
        userPassword = "1234";

        //Kullanıcıdan şifre girişi istenir.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();

        //Kullanıcının girdiği şifre ile sistemdeki kayıtlı şifre kontrol edilir.
        if (password.equals(userPassword)){
            System.out.println("Giriş gerçekleştirildi");
        } else {

            //Şifre hatalı ise bu blok çalışır ve şifre sıfırlama istenip istenmediği kullanıcıya sorulur.
            System.out.print("Şifrenizi yanlış girdiniz. Sıfırlamak ister misiniz? Yes(1)/No(2) = ");
            Scanner input2 = new Scanner(System.in);
            answer = input2.nextLine();

            //Şifrenin değiştirilmesi isteniyorsa yeni şifre talebi yapılır.
            if (answer.equals("1")){
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                Scanner input3 = new Scanner(System.in);
                newPassword = input3.nextLine();

                //Kullanıcıdan alınan yeni şifre, eski şifreden farklı ya da doğru sayısal rakamlar olana kadar döngü çalıştırılır.
                while (newPassword.equals(userPassword)){
                   System.out.print("Şifre Oluşturulamadı (Eski şifrenizi ya da hatalı bir şifre girdiniz), lütfen başka şifre giriniz: ");
                   Scanner input4 = new Scanner(System.in);
                   newPassword = input4.nextLine();
                }
                System.out.println("Şifre oluşturuldu.");
            } else {
                System.out.println("Sisteme giriş gerçekleştirilemedi.");
            }
        }
    }
}
