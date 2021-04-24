package OOP2;

public class TestInvoice {
    public static void main(String[] args){
        Customer c1 = new Customer(8, "Karlygash",20 );
        Invoice i1 = new Invoice(8, c1, 90);
        System.out.println("Name is: " + c1.getName());
        System.out.println("Same name: "+ i1.getCustomerName());
        System.out.println("Customer info:" + i1.getCustomer());
        System.out.println("ID:" + i1.getID());
        System.out.println("Amount is: "+ i1.getAmount());
        System.out.println("After discount: " +i1.getAmountAfterDiscount());

    }
}
