package Exercises;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        int [] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = (int) (a * Math.pow(d,i));
        }
        for (int i=0; i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
