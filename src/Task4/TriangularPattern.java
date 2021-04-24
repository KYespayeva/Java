package Task4;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Type number");
        num = in.nextInt();
        for (int i = 1; i<=num ; i++){
            System.out.print("# ");
            for (int j=1; j<=i-1;j++){
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
