package Task3;
import java.util.Scanner;
public class IncomeTaxCalculator {
    public static  void main(String[] args) {
        Scanner in = new Scanner((System.in));
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        final double TAX_RATE = 0.0;
        int taxableIncome;
        double i;
        double taxPayable;
        System.out.print("Введите налогооблогаемый доход: ");
        taxableIncome = in.nextInt();
        System.out.print(" доллара США" + "\n");


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
               System.out.print(" долларов США");




    }
}