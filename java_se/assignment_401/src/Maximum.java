import java.util.Arrays;

public class Maximum {
    static void maximum(int[] arr)
    {

        if (arr.length < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }

        // Sort the array
        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--)
        {

            if (arr[i] != arr[arr.length - 1])
            {
                System.out.println("The first largest element is "+ arr[arr.length-1]);
                System.out.println("The second largest element is "+ arr[i]);
                return;
            }
        }

        System.out.println("The first largest element is "+ arr[arr.length-1]);
        System.out.println("There is no second largest element");
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 35, 1, 10, 34, 1};
        maximum(arr);
    }

}
