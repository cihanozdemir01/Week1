package Week2;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1}; // Elemanların frekansını bulunacak dizi

        System.out.println("Tekrar sayıları");
        // Elemanların frekanslarını hesaplamak için döngü kullanılır
        for (int i = 0; i < array.length; i++) {
            // Elemanın daha önce işlenip işlenmediğini kontrol etmek için bir bayrak kullanılır
            boolean isProcessed = false;
            // Dizi boyunca bir döngü daha başlatılır
            for (int j = 0; j < i; j++) {
                // Eğer eleman daha önce işlenmişse bu döngü atlanır
                if (array[i] == array[j]) {
                    isProcessed = true;
                    break;
                }
            }
            // Eğer eleman daha önce işlenmemişse, o elemanın frekansı hesaplanır

            if (!isProcessed) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                // Elemanın frekansı yazdırılır
                System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
