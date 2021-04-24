package Exercises;
import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type a quantity of elements ");
        int n = in.nextInt();
        if (n>10){
            System.out.println("NO MORE THAN 10!");
            System.exit(0);
        }
        int[] arr = new int[n];
        System.out.println("Type the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
