import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = sc.next();

        System.out.print("Input second binary number: ");
        String binary2 = sc.next();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
    }
}