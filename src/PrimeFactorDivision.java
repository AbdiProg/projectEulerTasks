public class PrimeFactorDivision {


    public static void main(String[]args){
            printLargestPrimeFactor(13195);
    }

    /**
     * Eine Klassenmethode, welche die nächst durch "number" teilbare Primzahl zurückgibt.
     * @param number
     * @return
     */
    public static int nextDivisablePrime(int number){

        for(int i = 2; i < number; i++) {
            if (isPrime(i) && number % i == 0) return i;
        }
        return 0;
    }

    /**
     * Eine Klassenmethode, welche eine Zahl "n" danach überprüft, ob diese eine Primzahl darstellt.
     * @param n
     * @return
     */
    public static boolean isPrime(int n){

        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }

        return true;

    }

    /**
     * Diese Klassenmethode gibt den größten Primfaktor einer Zahl "n" auf der Konsole aus.
     * @param n
     */
    public static void printLargestPrimeFactor(int n){

        int backupN = n;
        while(!isPrime(backupN)){
            int nextDivisablePrime = nextDivisablePrime(backupN); //Die nächst beste Primzahl wird der Variablen zugewiesen.
            backupN = backupN / nextDivisablePrime; //Unsere Zahl n wird durch diese Primzahl geteilt.

        }

        System.out.println(backupN);

    }




}
