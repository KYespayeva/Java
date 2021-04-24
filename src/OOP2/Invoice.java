package OOP2;

public class Invoice {
    private int ID;
    Customer customer;
    double amount;
    public Invoice(int ID, Customer customer,int amount){
        this.amount = amount;
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        int dis = customer.getDiscount();
        double per = dis/100; //0.2
        return amount - (amount * per);
    }
}
