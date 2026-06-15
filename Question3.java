import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        sc.close();
    }
}