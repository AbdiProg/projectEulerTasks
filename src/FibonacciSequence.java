public class FibonacciSequence {



    public static void main(String[]args){
        sumOfEvenFibonacciIterative(100);
    }

    /**
     * Iterative Version der Berechnung von Fibonacci
     * @param n
     */
    public static void sumOfEvenFibonacciIterative(int n){

        int sum = 0;
        int i = 0;

        int firstNumber = 0;
        int secondNumber = 1;

        while( i < n ){

            System.out.println(firstNumber);
            System.out.println(secondNumber);
            int newSecondNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = newSecondNumber;
            i++;

        }


    }

}
