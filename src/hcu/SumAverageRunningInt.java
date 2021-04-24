package hcu;
public class SumAverageRunningInt {
    public static void main(String[] args){
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number <= upperbound; ++number){
            sum+=number;
        }
        average = (upperbound+lowerbound)/2.0;
        System.out.println(sum);
        System.out.println(average);
    }
}
