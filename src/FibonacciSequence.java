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
     * Fibonacci
     * @param n
     */
    public static void sumOfEvenFibonacciRecursive( int n){

        recursiveHelper(0, 1, 0, n);

    }

    /**
     * Rekursive Hilfsfunktion, um die beiden zusätzlichen Parameter wie die erste Zahl und die zweite Zahl in eine weitere Methode zu packen.
     * @param firstNumber
     * @param secondNumber
     * @param n
     */
    public static int recursiveHelper(int firstNumber, int secondNumber, int sum, int n){

        if(n == 1){
            return sum;
        }

        int tmpSum = firstNumber + secondNumber;
        System.out.println(tmpSum);
        firstNumber = secondNumber;
        secondNumber = tmpSum;
        sum = sum + secondNumber;
        return recursiveHelper(firstNumber, secondNumber, sum, n-1);

    }



}
