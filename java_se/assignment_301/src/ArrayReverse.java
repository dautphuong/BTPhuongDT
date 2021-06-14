public class ArrayReverse {
    public static void main(String[] args) {
        int[]myIntArray={43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
        int[] arrReverse=new int[myIntArray.length];
        int j = myIntArray.length;
        for (int i = 0; i < myIntArray.length; i++) {
            arrReverse[j - 1] = myIntArray[i];
            j = j - 1;
        }

        System.out.print("Original Array :");
        for (int i=0;i<myIntArray.length;i++){
            System.out.print(myIntArray[i]+" ");
        }
        System.out.println();
        System.out.print("Reversed Array :");
        for (int i=0;i<arrReverse.length;i++){
            System.out.print(arrReverse[i]+" ");
        }
    }
}
