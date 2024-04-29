package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan girdilerle banka hesabının yönetildiği atm projesi oluşturulmuştur.
public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance = 1500;
        int select;
        int price;

        while(right>0){

            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("""
                                   1- Para Yatırma 
                                   2- Para Çekme
                                   3- Bakiye Sorgula
                                   4- Çıkış Yap""");

                System.out.println();
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                switch(select){

                    case 1:
                        System.out.print("Para Miktarı : ");
                        price = input.nextInt();
                        balance+=price;
                        break;
                    case 2:
                        System.out.print("Para Çekme : ");
                        price = input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye Yetersiz");
                        }else{
                            balance-=price;
                        }
                        break;
                    case 3:
                        System.out.print("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere");
                        break;
                }
                break;

            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı ve şifre. Tekrar deneyiniz");

                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }

        }
    }
}
