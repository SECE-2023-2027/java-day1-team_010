import java.util.Arrays;

public class Q9_RotateArray {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int first = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = first;

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}