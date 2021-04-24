package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class MinMax1 {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Type a quantity of elements ");
    int n = in.nextInt();
    int[] arr = new int[n];
    System.out.println("Type the elements of the array: ");
    for(int i=0; i<n; i++)
    {
        arr[i]=in.nextInt();
    }
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println("Elements of array sorted: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < n; i++) {
        if(max<arr[i]){
            max = arr[i];
        }
        if(min>arr[i]){
            min = arr[i];
        }

    }
    System.out.println("\nMin: "+ min +" Max: "+ max);
}
}
