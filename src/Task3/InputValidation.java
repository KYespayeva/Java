package Task3;
import java.util.Scanner;
public class InputValidation
{

        public static void main (String[]args)
        {

            int numberIn;
            boolean isValid = false;




            do {
                System.out.print("Введите число от 0 до 10 или от 90 до 100: ");
                Scanner in = new Scanner(System.in);
                numberIn = in.nextInt();

                if (numberIn <= 10 && numberIn >= 0 || numberIn >= 90 && numberIn <= 100) {
                    isValid = true;
                    System.out.print("Вы ввели: " + numberIn);
                    break;
                } else {
                    System.out.print("Недействительный ввод, попробуйте еще раз...\n");

                }
            } while (!isValid);


        }
}
