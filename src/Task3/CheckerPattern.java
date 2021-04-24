package Task3;
import java.util.Scanner;
public class CheckerPattern {
    public static void main(String[] args){
        int size;
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        for (int roq=1;roq<=size;roq++){
            for (int col = 1;col <= size-1;col++){
                if ((roq% 2)==0){
                    System.out.print(" #");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

    }
}
