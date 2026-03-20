import java.util.Scanner;

public class Task7 {
    public static void reverseOutput(int n, Scanner scanner) {
        if (n <= 0) {
            return;
        }
        int number = scanner.nextInt();
        reverseOutput(n - 1, scanner);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of numbers (n):");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println("Enter the numbers:");
            reverseOutput(n, scanner);
        } else {
            System.out.println("Invalid input for n.");
        }

        scanner.close();
    }
}