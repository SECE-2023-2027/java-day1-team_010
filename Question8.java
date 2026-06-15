import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binary = sc.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal Number: " + decimal);
    }
}