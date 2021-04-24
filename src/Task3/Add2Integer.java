package Task3;
import java.util.Scanner;

public class Add2Integer {
    public static void main(String [] args){

        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Add first integer ");
        num1 = in.nextInt();
        System.out.println("Add second integer");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is : " + sum);
        in.close();
    }
}
