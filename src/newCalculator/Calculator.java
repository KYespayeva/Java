package newCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Made by YESPAYEVA KARLYGASH");
        Scanner in = new Scanner(System.in);
        boolean process = true;
        double result = 0;

        while (process == true) {
            try {
                System.out.print("Type -1 to stop process or any other number to continue: ");
                int type = in.nextInt();
                if (type != -1) {
                    System.out.print("Enter 1st number: ");
                    double num1 = in.nextDouble();
                    System.out.print("Type operator: ");
                    char operator = in.next().charAt(0);
                    System.out.print("Enter 2nd number: ");
                    double num2 = in.nextDouble();

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            System.out.println("Result is: " + result );
                            break;
                        case '-':
                            result = num1 - num2;
                            System.out.println("Result is: " + result );
                            break;
                        case '/':
                            if (num2 == 0){
                                System.out.println("Divided by 0");
                                break;
                            }
                            else{
                            result = num1 / num2;
                            System.out.println("Result is: " + result );
                            break;
                            }
                        case '*':
                            result = num1 * num2;
                            System.out.println("Result is: " + result );
                            break;
                        default:
                            System.out.print("Wrong operator!");
                            break;
                    }

                }
                else {
                    System.out.print("Process finished");
                    in.close();
                    process = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, Try again");
                in.next();
            }
            /*
            catch (ArithmeticException a) {
                System.out.println("Divided ");
                in.next();

            } */

        }

    }
}
