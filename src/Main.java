import java.util.Scanner;

public class Main {

    public static void printDigits(String s, int i) {
        if (i == s.length()) return;
        System.out.println(s.charAt(i));
        printDigits(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        printDigits(input, 0);
    }
}