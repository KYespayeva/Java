package Task3;
import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
   public static void main(String[] args){
       final int SENTINEL = -1;
       final double TAX_RATE_ABOVE_20K = 0.1;
       final double TAX_RATE_ABOVE_40K = 0.2;
       final double TAX_RATE_ABOVE_60K = 0.3;
       final double TAX_RATE = 0.0;
       Scanner in = new Scanner((System.in));
       int taxableIncome;
       double i;
       double taxPayable = 0;
       System.out.print("Введите налогооблагаемый доход (или -1 в конце): $");
       taxableIncome = in.nextInt();

       if (taxableIncome == SENTINEL){
           System.out.print("GOODBYE!");
       }

       if (taxableIncome>=60000){
           double ost = taxableIncome - 60000;
           taxPayable = (ost * TAX_RATE_ABOVE_60K) + (20000 * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K);
       }

       else if (taxableIncome >=40000) // 35000 - 20000 // 40000-20000
       {
           double ost = taxableIncome - 40000;
           taxPayable = (ost * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K); // 50000 0 0.1

       }
       else if (taxableIncome >=20000)
       {
           double ost = taxableIncome - 20000;
           taxPayable = (ost * TAX_RATE_ABOVE_20K) ;

       }
       else {
           taxPayable = taxableIncome * TAX_RATE;
       }
           System.out.print("Подоходный налог, подлежащий уплате, составляет: " + taxPayable);
           System.out.print(" долларов США\n");
       System.out.print("Введите налогооблагаемый доход (или -1 в конце): $");
       taxableIncome = in.nextInt();

       if (taxableIncome == SENTINEL){
           System.out.print("GOODBYE!");
           System.exit(0);
       }

       if (taxableIncome>=60000){
           double ost = taxableIncome - 60000;
           taxPayable = (ost * TAX_RATE_ABOVE_60K) + (20000 * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K);
       }

       else if (taxableIncome >=40000) // 35000 - 20000 // 40000-20000
       {
           double ost = taxableIncome - 40000;
           taxPayable = (ost * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K); // 50000 0 0.1

       }
       else if (taxableIncome >=20000)
       {
           double ost = taxableIncome - 20000;
           taxPayable = (ost * TAX_RATE_ABOVE_20K) ;

       }
       else {
           taxPayable = taxableIncome * TAX_RATE;
       }
       System.out.print("Подоходный налог, подлежащий уплате, составляет: " + taxPayable);
       System.out.print(" долларов США \n");




   }

}
