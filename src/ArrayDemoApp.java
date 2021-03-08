public class ArrayDemoApp {
    public static void main(String[] args) {

        /*

        datatype[] name = new datatype[length];
        name[index 0..length] = values of datatype;
        name.length = returns the lenght
         */
        int[] intArray = new int[5]; // int a, b, c, d, e || int z1, z2, z3, z4, z5;
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 99; // 5. Wert

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }

        /* Array beginnt mit Index 0 => erste Wert
        *  Funktioniert mit beliebigen Datentyp
        *  = new Datentyp[ANZAHL];
        * */
    }
}
