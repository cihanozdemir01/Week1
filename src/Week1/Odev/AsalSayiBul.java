package Week1.Odev;

// 1-100'e kadar olan sayıların içerisinde asal olanları bulan program..
public class AsalSayiBul {
    public static void main(String[] args) {

        int count=0;
        for(int num=2;num<=100;num++)
        {
            int check = 0;
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                {
                    check = 1;
                    break;
                }
            }

            if(check==0)
            {
                System.out.print(num+" ");
                count++;
            }
        }

    }
}