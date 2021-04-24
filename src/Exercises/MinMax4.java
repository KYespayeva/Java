package Exercises;

import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type a quantity of elements ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min = arr[i];
            }

        }
        System.out.println("Minimum: " + min);
}
}
