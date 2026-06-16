import java.util.Scanner;

public class Q13_ReplacePythonJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string:");
        String str = sc.nextLine();

        str = str.replace("python", "#TEMP#");
        str = str.replace("java", "python");
        str = str.replace("#TEMP#", "java");

        System.out.println("New string:");
        System.out.println(str);

        sc.close();
    }
}