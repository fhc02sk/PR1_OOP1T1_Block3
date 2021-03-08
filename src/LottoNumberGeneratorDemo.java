import java.util.Random;

public class LottoNumberGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps");

        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
    }

    public static int generateOneNumber(){
        Random random = new Random();
        int value = (random.nextInt() % 45) + 1;
        if (value < 0) {
            value = value * -1;
        }
        return value;
    }
}
