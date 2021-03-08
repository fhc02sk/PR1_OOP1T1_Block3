public class PrimValidationDemo {

/*
   1. Schritt: Write a program and a methode ("isPrim"), which checks a number,
        if a given number is a prim or not (boolean), and gives this result to the caller
   2. Schritt:  Alle Primzahlen, zwischen 2 und 1234 ausgeben

*/

    public static void main(String[] args) {

        /*System.out.println("isPrim(31) = " + isPrim(31));
        System.out.println("isPrim(42) = " + isPrim(42));
        System.out.println("isPrim(99961) = " + isPrim(99961));
        System.out.println("isPrim(906847) = " + isPrim(906847));
        System.out.println("isPrim(999983) = " + isPrim(999983));
        System.out.println("isPrim(1991999993) = " + isPrim(1991999993));
        System.out.println("isPrim(500) = " + isPrim(500));*/

        System.out.println("start");
        System.out.println("isPrim(1991999992) = " + isPrim(1991999992));
        System.out.println("isPrim(1991999993) = " + isPrim(1991999993));


        int checkNumbers = 2;
        while (checkNumbers <= 1234){
            if (isPrim(checkNumbers)) {
                System.out.print(checkNumbers + ", ");
            }
            checkNumbers++;
        }


        int counter = 1;                // Initialisierung, Startwert festlegen
        while (counter < 1000) {        // Abbruchbedingung
            // some code begin
            // interessiert uns wirklich
            // some code nd
            counter++;                  // Increment (Erhöhung)
        }

        // for(initialisierung; bedingung; increment)
        for(int i = 541; i < 791; i++){

            //break;
        }
    }

    public static boolean isPrim(int number) {
        int checkValue = 2;
//        boolean checkIsPrim = true;
        while (checkValue < Math.sqrt(number)) {

            if (number % checkValue == 0){
                // Ups, es keine Primzahl, da es irgendeinen Teiler gibt
  //              checkIsPrim = false;
                // Abbrechen, da alles was jetzt noch kommt, hat keine Relevanz
                //break;
                return false;
            }
            checkValue++;
        }

        //return checkIsPrim;
        return true;
    }

}
