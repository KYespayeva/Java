package OOP2;

public class Account {
    private int id;
    Customer2 customer;
    private double balance = 0.0;

    public Account(int id, Customer2 customer, double balance){
        this.balance = balance;
        this.customer = customer;
        this.id = id;
    }
    public Account(int id, Customer2 customer){
        this.customer = customer;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString()+" balance="+balance;
    }
    public double deposit(double amount){
        double am= amount+balance;
        return  am;
    }
    public double getwithdraw(double amount){
        if (balance >= amount){
            amount = amount - balance;
            return amount;
        }
        else {
            System.out.println( "amount withdrawn exceeds the current balance!");
        }
        return amount;
    }
}
