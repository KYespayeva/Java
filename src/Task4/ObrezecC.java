package Task4;

import java.util.Scanner;

public class ObrezecC {
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Type number");
        num = in.nextInt();
        for (int i = 0; i<= num; i++){
            System.out.print("# ");
            for (int j =0; j-1<=num-i;j++)
            if (i>=j){
                System.out.print("# ");

            }
            else
                {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
