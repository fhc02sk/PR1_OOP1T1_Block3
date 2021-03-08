import java.util.Random;

public class LottoNumberGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps");

        // Verschachtelung von Schleifen
        for (int tipps = 0; tipps < 5; tipps++) {
            System.out.print("Nr. " + tipps + ": ");
            int[] arr = createOneTipp();

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    public static int[] createOneTipp(){
        int[] oneTipp = new int[6]; // 1.

        //  for(startwert; bedingung;inkrement)
        for (int i = 0; i < oneTipp.length; i++) {
            oneTipp[i] = generateOneNumber(45) ; // 2.
        }

        return oneTipp; // 3.
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
