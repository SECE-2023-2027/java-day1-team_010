public class Q10_FirstLastSame {
    public static void main(String[] args) {
        int[] array = {50, -20, 0, 30, 40, 60, 10};

        boolean result = array.length >= 2 &&
                         array[0] == array[array.length - 1];

        System.out.println(result);
    }
}