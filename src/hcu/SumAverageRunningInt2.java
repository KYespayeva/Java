package hcu;

public class SumAverageRunningInt2 {
    public static void main(String [] args){
        int sum = 0;
        int sum2 = 0;
        int number = 1;
        int number2 = 1;
        int upperbound=100;
        while (number <=upperbound){
            sum += number;
            number++;
        }
        System.out.println(sum);
        do {
            sum2+=number2;
            number2++;
        }
        while (number2 <= upperbound);
        System.out.println(sum2);
    }
}
