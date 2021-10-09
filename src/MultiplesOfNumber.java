import java.net.StandardSocketOptions;

public class MultiplesOfNumber {



    public static void main(String[]args){
        listAllMultiplesIterative(100, 6);
        System.out.println("\n");
        listAllMultiplesRecursive(6, 100);
    }

    /**
     *
     * @param upperBound stellt die oberste Grenze, bis dahin Vielfache gesucht werden sollen,
     * @param multipleOf stellt die Zahl dar, von der Vielfache gesucht werden sollen.
     *
     * Vorbedingung:
     *                   Übergabe von zwei ganzen Zahlen.
     *
     * Nachbedingung:
     *                   Übergabe aller Vielfachen einer beliebigen ganzen Zahlen.
     *
     * Invariante:
     *                   Nach h>=0 Iterationen gilt:
     *                   Wenn h eine Vielfache von j ist, dann wird h ausgegeben.
     * Variante:
     *                   h steigt um 1.
     *
     * Korrektheitsbeweis:
     *
     */
    public static void listAllMultiplesIterative(int upperBound, int multipleOf){
        int i = 1;

        while(i <= upperBound){
            if(i % multipleOf == 0) System.out.print(i+" ");
            i++;
        }
    }

    /**
     * Rekursive Version der obigen Klassenmethode.
     *
     * @param multipleOf
     * @param n
     */
    public static void listAllMultiplesRecursive(int multipleOf, int n){

        if(n == 1){
            return;
        }

        if(n % multipleOf == 0) System.out.print(n+" ");

        listAllMultiplesRecursive(multipleOf, n-1);

    }


}
