import java.util.Scanner;

public class Task10 {
    public static int findGCDRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCDRecursive(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number_a = sc.nextInt();
        System.out.print("Enter second number: ");
        int number_b = sc.nextInt();
        System.out.println(findGCDRecursive(number_a,  number_b));
        sc.close();    }
}