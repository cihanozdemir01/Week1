package Week2;

// Calculate the Harmonic Mean of Numbers in a List
public class HarmonicAverage {
    public static void main(String[] args) {
        int i;
        double[] numbers = {1,2,3,4,5,6};
        double sumHarmonic=0,result;
        for ( i = 0; i<numbers.length; i++){
            sumHarmonic+=1/numbers[i];
        }
        result=i/sumHarmonic;
        System.out.println("Harmonik Ortalama : " + result);
    }
}
