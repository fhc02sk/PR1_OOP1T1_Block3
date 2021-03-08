public class NumberFactorsDemoApp {

    public static void main(String[] args) {

        int resultOfMethod = findDivisors(501);

        System.out.println("\nresultOfMethod = " + resultOfMethod);

        System.out.println("Anzahl Teiler: " + findDivisors(42));
        System.out.println("Anzahl Teiler: " + findDivisors(74));
        System.out.println("Anzahl Teiler: " + findDivisors(123456));
        System.out.println("Anzahl Teiler: " + findDivisors(31));
    }

    /*
           1. Schritt: Write a program and a methode ("isPrim"), which checks a number,
                if a given number is a prim or not (boolean), and gives this result to the caller
           2. Schritt:  Alle Primzahlen, zwischen 2 und 1234 ausgeben

     */

    /*
        Methode soll alle möglichen Teiler zu einer Zahl ausgeben, und die Anzahl der Teiler retournieren

     */
    public static int findDivisors(int number){
        int counter = 1;
        int countPossibleDivisors = 0;
        while (counter <= number){
            if (number % counter == 0) {
                System.out.print(counter + ", ");
                countPossibleDivisors++;
            }
            counter++;
        }

        return countPossibleDivisors;
    }

    public static void findDivisorsWithoutReturn(int number) {
        System.out.println("42 = " + 42);
    }

}
