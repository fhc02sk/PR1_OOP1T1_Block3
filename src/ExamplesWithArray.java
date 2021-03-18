public class ExamplesWithArray {
    public static void main(String[] args) {


        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 0};

        System.out.println("arr.length = " + arr.length);

        System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));
    }

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmallestNumber(int[] arr){
        int keep = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < keep) {
                keep = arr[i];
            }
        }
        return keep;
    }

    // TODO 2: Write a method, finding and returning the biggest number
    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    // TODO 4: Write a method, calculating and returning the average over all numbers

    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)



}
