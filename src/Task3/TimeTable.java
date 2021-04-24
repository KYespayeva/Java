package Task3;
import java.util.Scanner;
public abstract class TimeTable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberin;
        int multitab;


        numberin = in.nextInt(); // numberin = int(input())
        for (int i = 1; i <= numberin; i++) // for i in range(numberin)
        {
            System.out.print(i + "  "); // print(" ")
            for (int j = 1; j <= numberin;j++ )
            {
                multitab=i*j;
                System.out.printf("%4d",i*j); // print(i*j)

            }
           System.out.println();

        }
    }

}
