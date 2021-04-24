package Task2;

public class CozaLozaWoza {
    public static void main(String[] args){
        boolean print;
        int lowerbound = 1 , upperbound = 110;
        for (int number = lowerbound; number<=upperbound; ++number){
            print = false;
            if(number % 3 == 0){
                System.out.print("Coza");
                print = true;
            }
            if (number%5==0){
                System.out.print("Loza");
                print = true;
            }
            if (number%7==0){
                System.out.print("Woza");
                print = true;
            }
            if (!print){
                System.out.print(number);
            }
            if (number%11==0){
                System.out.print("\n");
                print = true;
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
