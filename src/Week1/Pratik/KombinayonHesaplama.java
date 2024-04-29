package Week1.Pratik;
import java.util.Scanner;

// Kullanıcıdan alınan n ve r değerlerine göre C(n,r) kombinasyon hesabını yapan program.
public class KombinayonHesaplama {
    public static void main(String[] args) {

        int n,r,result;
        int totalN =1,totalR=1,totalNR=1;

        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) Kombinasyonunda n değerini giriniz : ");
        n = input.nextInt();
        System.out.print("C(n,r) Kombinasyonunda r değerini giriniz : ");
        r = input.nextInt();

        // n değerinin, r değerinin ve (n-r) değerinin faktöriyelleri bulunur.
        for ( int i=1; i<=n; i++){
            totalN=totalN*i;
        }
        for ( int i=1; i<=r; i++){
            totalR=totalR*i;
        }
        for ( int i=1; i<=(n-r); i++){
            totalNR = totalNR*i;
        }

        // Kombinasyon formülüne göre işlem gerçekleştirilir.
        result = (totalN/(totalR*(totalNR)));
        System.out.println("C("+n+","+r+") kombinasyon sonucu : " + result);

    }
}
