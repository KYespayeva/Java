package zalc;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arg1;
        int arg2;
        int arg4;// 0 1
        int result = 0;
        String arg3;


        System.out.println("Made by YESPAYEVA KARLYGASH");
         for (int i = 0 ; i<4; i++) {
             System.out.print("\n Продолжить операцию?" + "\n" + "Введите -1 (yes) or other (exit) \n");
             arg4 = in.nextInt();
             if (arg4 == 0) {
                 System.exit(0);
             }

             System.out.print("Введите число");
             arg1 = in.nextInt();
             System.out.print("Введите число");
             arg2 = in.nextInt();
             System.out.print("Введите операцию");
             arg3 = in.next();

             switch (arg3) {
                 case "*":
                     result = arg1 * arg2;
                     break;
                 case "+":
                     result = arg1 + arg2;
                     break;
                 case "-":
                     result = arg1 - arg2;
                     break;
                 case "/":
                     result = arg1 / arg2;
                     break;
                 default:
                     System.out.println("Неправильно введена операция");

             }
             System.out.print(result);
         }

        }

}
