package Task3;
import java.util.Scanner;
public class SumOfDigitsInt {
    public static void main(String[] args){
        Scanner  in = new Scanner (System.in);
        int inNumber;
        System.out.print("Введите целое число: ");
        inNumber = in.nextInt();
        int sum = 0;
        int inDigit;
        while (inNumber>0){
            inDigit = inNumber%10;
            inNumber /=10;
            sum += inDigit;

        }

        System.out.print("Сумма всех цифр: "+sum);

    }
}
