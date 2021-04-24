package Task3;
import java.util.Scanner;
public class SalesTaxCalculator {
    public static void main(String[] args){
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;

        Scanner in = new Scanner(System.in);

        double price, actualPrice, salesTax;
        double totalPrice = 0.0 , totalActualprice = 0.0 , totalSalesTax = 0.0;
        System.out.print("Введите цену с учетом налогов в долларах (или -1 в конце) :\n");
        price = in.nextInt();
        while (price != SENTINEL){


        }
        totalPrice = price;
        totalSalesTax = price%100;
        totalActualprice = totalPrice - totalSalesTax;

        System.out.print("Общая цена " + totalPrice + "\n");
        System.out.print("Общая фактическая цена " + (totalActualprice) + "\n");
        System.out.print("Общий налог с продаж: " + totalSalesTax);

        System.exit(0);



    }
}
