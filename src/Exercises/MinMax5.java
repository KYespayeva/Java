package Exercises;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // n
        int m , v;

        int max = 0;
        int num =0;
        for (int i = 0; i < n; i++) {
            {
                m = in.nextInt();
                v= in.nextInt();
                if (m/v>max){
                    max = m/v;
                    num =i+1;
                }
            }
        }


        System.out.print("Position: "+ num + " Max P: " + max);
    }
}
