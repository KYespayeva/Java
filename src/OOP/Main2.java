package OOP;

public class Main2 {
    public static void main(String[] args){
        InvoiceItem i1 = new InvoiceItem("Hello" , "hey", 30 , 6.0);
        System.out.println("Total:" + i1.getTotal());
        System.out.println(i1.toString());

        Account a1 = new Account("One","Heeehe" , 1);
        a1.credit(4);
        System.out.println(a1.toString());

        Date d1 = new Date(28 , 12 , 2020);
        System.out.println(d1.toString());

        Time t1 = new Time(5, 12 , 40);
        System.out.println(t1.toString());
        System.out.println("Previous: " + t1.previousSecond() + " and next: " + t1.nextSecond());

    }
}
