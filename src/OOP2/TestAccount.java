package OOP2;

public class TestAccount {
    public static void main(String[] args){
            Customer2 c1 = new Customer2(8, "Karlygash", 'f');
            System.out.println(c1);
            System.out.println(c1.getName());
            System.out.println(c1.getGender());
            System.out.println(c1.getID());

            Account a1 = new Account(8, c1, 500 );
            System.out.println(a1);
            System.out.println(a1.getBalance());
            System.out.println(a1.getCustomer());
    }
}


