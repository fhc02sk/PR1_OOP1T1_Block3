public class ArrayDemo2App {

    public static void main(String[] args) {

        int n1 = 54;
        int n2 = 33;
        int n3 = 12;
        int n4 = 44;
        int n5 = 77;
        
        int summe = n1 + n2 + n3 + n4 + n5;
        double avg = summe / 5.0;

        System.out.println("avg = " + avg);
     
        int[] arr = new int[7];
        arr[0] = 54; //n1
        arr[1] = 33;
        arr[2] = 12;
        arr[3] = 44;
        arr[4] = 77; // n5
        arr[5] = 17; // n6
        arr[6] = 21; // n7

        // replaces line 16 - 23
        int[] arr2 = {54, 33, 12, 44, 77, 17, 21, 99};
        System.out.println("arr2.length = " + arr2.length);
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 = sum2 + arr[i];
        }
        
        double avg2 = sum2 / arr.length;
        System.out.println("avg2 = " + avg2);
    }
}
