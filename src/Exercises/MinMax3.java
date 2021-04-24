package Exercises;
import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        int n = in.nextInt();

        for (int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a*b>max){
                max=a*b;
            }
        }

        System.out.println("Area"+max);
    }
}
