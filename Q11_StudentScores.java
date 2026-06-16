import java.util.Scanner;

public class Q11_StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of students:");
        int n = sc.nextInt();

        String highName = "", highId = "";
        String lowName = "", lowId = "";
        int highScore = -1;
        int lowScore = 101;

        System.out.println("Input Student Name, ID, Score:");
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            if (score > highScore) {
                highScore = score;
                highName = name;
                highId = id;
            }

            if (score < lowScore) {
                lowScore = score;
                lowName = name;
                lowId = id;
            }
        }

        System.out.println("name, ID of the highest score and the lowest score:");
        System.out.println(highName + " " + highId);
        System.out.println(lowName + " " + lowId);

        sc.close();
    }
}