package Exercises;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class MinMax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a quantity of square ");
        int n = in.nextInt();
        System.out.println("Type the elements of the array: ");
       int a , b ;
       int min = (int) 1e10;
        for (int i = 0; i < n; i++) {
            {
                     a = in.nextInt();
                     b = in.nextInt();
                     if (a*b<min){
                         min = a*b;
                     }
            }
        }
        System.out.println("Minimal area is:"+min);

    }
}
