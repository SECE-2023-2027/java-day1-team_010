import java.util.Scanner;

public class Q15_StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string (you can include space as well)");
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println("The compressed string along with the counts of repeated characters is:");
        System.out.println(compressed);

        sc.close();
    }
}