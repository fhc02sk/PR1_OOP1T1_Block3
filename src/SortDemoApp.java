import java.util.Arrays;

public class SortDemoApp {
    public static void main(String[] args) {

        int[] arr = new int[7];
        arr[0] = 9; // int arr1 = 9;
        arr[1] = 8; // int arr2 = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 5;
        arr[5] = 4;
        arr[6] = 3; // int arr7 = 3;

        arrangeOrder(arr);

//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeOrder(int[] numbers) {

        System.out.println("length=" + numbers.length);

        /*
            1. Schiebe eine Karte auf die Seite => Schiebe die rechte auf die Seite
            2. Schiebe die linke Karte auf die Position der rechten Karte bzw. freie Position
            3. Schiebe die gesicherte Karte auf die neue frei Position
         */

        int space = numbers[1]; // 8er auf die Seite geschoben
        numbers[1] = numbers[0];// auf die frei Position die linke Karte hingeschoben
        numbers[0] = space; // 0 ist freigeworden, hier die gesicherte Karte ablegen


        // 1. Array von links nach rechts durchlaufe => for
        // 2. arr[i] mit arr[i+1] => austauschen
    }
}
