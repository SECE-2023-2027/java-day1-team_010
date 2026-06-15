import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary number is: " + binary);
    }
}