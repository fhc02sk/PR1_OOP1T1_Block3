import java.util.Random;

public class LottoNumberGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps");

        // Verschachtelung von Schleifen
        for (int tipps = 0; tipps < 5; tipps++) {
            System.out.print("Nr. " + tipps + ": ");
            createOneTipp();
            // wir speichern uns den int[]
            // wir gegen den Tipp aus
        }
    }

    // rewrite this method
    /*
        - no print inside method
        - erzeugt einen Array mit den Länge von 6 / creates an array with length of 6
        - befüllt den Array mit 6 Zufallszahlen / fills the array with 6 random numbers (immer noch nicht eindeutig)
        - retourniert den Array an den Aufrufer
     */
    public static void createOneTipp(){
        //  for(startwert; bedingung;inkrement)
        for (int i = 0; i < 6; i++) {
            System.out.print(generateOneNumber(45) + ", ");
        }
        System.out.println();
    }

    public static int generateOneNumber(int range){
        Random random = new Random();
        int randValue = random.nextInt();
        if (randValue < 0) {
            randValue = randValue * -1;
        }

        int value = (randValue % range) + 1;

        return value;
    }
}
