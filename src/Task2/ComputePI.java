package Task2;

public class ComputePI {
    public static void main (String [] args){
        double sum=0.0;
        int maxDenominator = 1000;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2){
            if (denominator%4==1) {
                sum += denominator;
            }
            else if (denominator%4==3){
                sum -= denominator;
            }
            else {
                System.out.println("Imposible!!!");
            }
            System.out.println(sum);
        }
    }
}
