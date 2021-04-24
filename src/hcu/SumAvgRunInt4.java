package hcu;

public class SumAvgRunInt4 {
    public static void main (String [] args){
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        int mini = 1;
        int maxi = 100;
        for (int number = mini; number<=maxi; number++){
            if (number%2==0){
                sumEven += number;
                  //2+4+6+8
            } else {
                sumOdd += number;

            }
        }

        if (sumOdd>sumEven){
            absDiff = sumOdd-sumEven;
        }
        else {
            absDiff = sumEven-sumOdd;
        }
         System.out.println("Sum of even Numbers: " + sumEven + "\n" +"Sum of odd Numbers: " + sumOdd);
        System.out.println(absDiff);
    }
}
