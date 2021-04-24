package Task2;

public class HarmonicSum {
    public static void main(String[] args){
       int maxDenominator = 50000;
       double sumL2R =0.0;
       double sumR2L =0.0;
       double absDiff;
       for (int denominator = 1; denominator<= maxDenominator; ++ denominator){
           sumL2R += (double) 1/denominator;
       }
       for (int denominator = maxDenominator; denominator>= 1;denominator--){
            sumR2L += (double) 1/denominator;
       }
       absDiff = (sumR2L - sumL2R);
       System.out.println(sumL2R + "\n" + sumR2L);

       System.out.println(absDiff);
    }
}
