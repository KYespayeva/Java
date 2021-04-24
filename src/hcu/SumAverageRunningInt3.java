package hcu;

public class SumAverageRunningInt3 {
    public static void main(String [] args){
        int count = 0;
        int mini = 111;
        int maxi= 8899;
        double average;
        for (int number = mini; number <= maxi; number++){
            count += number;
        }
        average = (maxi+mini)/2.0;
        System.out.println(count);
        System.out.println(average) ;
    }
}
