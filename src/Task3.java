import java.util.Scanner;

public class Task3 {
    public static String isPrime(int n, int d) {
        if (n <= 1) return "Composite";
        if (n == 2) return "Prime";
        if (n % d == 0) return "Composite";
        if (d * d > n) return "Prime";
        return isPrime(n, d + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(isPrime(number, 2));
        sc.close();
    }
}