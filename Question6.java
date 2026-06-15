import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal number is : " + hex);
    }
}