import java.util.Scanner;

public class Task2 {
    public static int averageofElements(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + averageofElements(arr, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int totalSum = averageofElements(numbers, n);
        double average = (double) totalSum / n;
        System.out.println(average);
        scanner.close();
    }
}

