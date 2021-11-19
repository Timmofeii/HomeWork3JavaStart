public class HomeWork3 {
    public static void main( String[] Args) {
    initialValue();
    fillDiagonal();
    changeArray();
    fillArray();
    invertArray();
    }

    private static void initialValue() {
        int len;
        int initialValue;

         int arr[] = new int[len];
         for (int i = 1; i < arr.length; i++){
             arr[i] = initialValue;
         }
         return arr;
        }


    private static void invertArray() {
        int[] arr1 = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
    }
    private static void fillArray() {
                int[] arr =new int[100];
                for (int i = 0; i < 100; i++) {
                    arr [i] = i;
                    System.out.println("arr[" + i + "] + " + arr[i]);

                    }
                }


    private static void changeArray() {
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int doubling = 2;
        for (int n = 0; n < arr3.length; n++) {
            if (arr3 [n]<6) {
                System.out.println(arr3[n] * doubling);
            }
        }
    }

    private static void fillDiagonal() {
        int[][] arr4 = new int[3][3];
        for ( int i = 0; i < arr4.length; i++) {
            for ( int k = 0; k < arr4.length; k++) {
                if (i == k){
                    arr4 [i] [k] = 1;
                }

            System.out.println(arr4[i][k] + " ");
        }

        System.out.println();
    }



    }
}