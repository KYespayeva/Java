package OOP2;
// MADE BY YESPAYEVA KARLYGASH
public class TestBook {
    public static void main(String[] args){
        // EXERCISE 1 Class Book
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummybook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummybook);

        dummybook.setPrice(29.95);
        dummybook.setQty(28);
        System.out.println("name is: " + dummybook.getName());
        System.out.println("price is: " + dummybook.getPrice());
        System.out.println("Author is: " + dummybook.getAuthor());
        System.out.println("Author's name is: "+ dummybook.getAuthor().getName());
        System.out.println("Author's email is: " + dummybook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java", new Author ("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);

        Book aBook = new Book ("HelloJava", new Author("Karlygash", "Karla@where.com", 'm'), 40.00);
        System.out.println(aBook.getAuthor().getName()+ " "+ aBook.getAuthor().getEmail());
        // EXERCISE 1.2 Class Book2
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book2 javaDummy = new Book2("Java for dummmy ", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
