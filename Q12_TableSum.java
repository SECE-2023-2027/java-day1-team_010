import java.util.Scanner;

public class Q12_TableSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of rows/columns (0 to exit)");
        int n = sc.nextInt();

        if (n == 0) return;

        int[][] table = new int[n][n];
        int[] colSum = new int[n];
        int grandTotal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + " ");
                rowSum += table[i][j];
                colSum[j] += table[i][j];
            }
            grandTotal += rowSum;
            System.out.println(rowSum);
        }

        for (int sum : colSum) {
            System.out.print(sum + " ");
        }
        System.out.println(grandTotal);

        sc.close();
    }
}