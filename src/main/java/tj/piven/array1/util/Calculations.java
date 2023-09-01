package tj.piven.array1.util;

public class Calculations {
    public static void countEven () {
        int [] arr = new int[] {};
        int a = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                a++;
            }
        }
            System.out.println(a);
    }

    public static void countOdd() {
        int [] arr = new int [] {};
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] % 2 != 0) {
                a++;
            }
        }
        System.out.println(a);

    }
 //   public static void countSimple (){
 //       int [] arr = new int [] {-3, 7, 6};
  //      int a = 0;

 //       for (int i = 0; i < arr.length; i++){

    public static void sumElem() {
        int [] arr = new int [] {2, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr [i];
        }
        System.out.println(sum);

    }
    public static void subtractIndex (){
        int [] arr = new int [] {3,4,5,6,7};
        int i = 1;
        while ( i <= arr.length - 1) {
            i = i + 2;
        }
        System.out.println(i);
    }
}







