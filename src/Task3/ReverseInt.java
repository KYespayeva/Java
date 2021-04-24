package Task3;
import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args){
        int inNumber;
        Scanner in = new Scanner (System.in);
        System.out.print("Введите положительное число: ");
        inNumber = in.nextInt();
        int inDigit;
        System.out.print("Обратное: ");
        while(inNumber>0){
            inDigit = inNumber % 10;
            inNumber /= 10;
            System.out.print(inDigit);

        }

    }
}
