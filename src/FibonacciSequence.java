public class FibonacciSequence {



    public static void main(String[]args){
        //sumOfEvenFibonacciIterative(100);
        sumOfEvenFibonacciRecursive(100);
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
            if(secondNumber % 2 == 0) sum = sum + secondNumber; //Falls secondNumber eine gerade Zahl darstellt, wird die Summe auf secondNumber draufaddiert.
            i++;

        }


    }


    /**
     *
     * @param n
     */
    public static void sumOfEvenFibonacciRecursive( int n){

        recursiveHelper(0, 1, n);

    }

    /**
     *
     * @param firstNumber
     * @param secondNumber
     * @param n
     */
    public static void recursiveHelper(int firstNumber, int secondNumber , int n){

        if(n == 1){
            return;
        }

        int tmpSum = firstNumber + secondNumber;
        System.out.println(tmpSum);
        firstNumber = secondNumber;
        secondNumber = tmpSum;

        recursiveHelper(firstNumber, secondNumber, n-1);

    }



}
