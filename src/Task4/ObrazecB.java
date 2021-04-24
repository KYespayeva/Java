package Task4;

import java.util.Scanner;

public class ObrazecB {
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Type number");
        num = in.nextInt();
        for (int i = 2; i<= num+1; i++){
            System.out.print("# ");
            for (int j=1; j>=i-num+1; j--){

                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
