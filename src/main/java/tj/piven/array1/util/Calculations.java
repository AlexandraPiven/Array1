package tj.piven.array1.util;

public class Calculations {
    public static void countEven () {
        int a = 0;
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                a = a + 1;
            }
            System.out.println(a);



            }
        }
    }

