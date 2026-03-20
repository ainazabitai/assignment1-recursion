import java.util.Scanner;

public class Task6 {
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(power(base, exponent));

        sc.close();
    }
}

