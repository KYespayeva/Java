package Task3;
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        for(int row = 1; row<=size; row++){
            System.out.print("* ");
           for (int col = 1; col<=size-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
