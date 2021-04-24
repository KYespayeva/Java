package Task3;
import java.util.Scanner;
public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;


        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            System.out.print("Введите оценку (0-100) ученика " + studentNo + ": ");
            isValid = false;
            do {
                Scanner in = new Scanner(System.in);
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                    break;
                } else {
                    System.out.print("Недействительный ввод, попробуйте еще раз...\n");
                }
            } while (!isValid);
            sum += numberIn;

        }
        average = sum / 3.00;
        System.out.print("Среднее значение: " + average);
    }
}
