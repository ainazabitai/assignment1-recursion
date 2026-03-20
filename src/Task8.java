import java.util.Scanner;

public class Task8 {
    public static String checkDigits(String s) {
        if (s == null || s.isEmpty()) {
            return "Yes";
        }
        if (!Character.isDigit(s.charAt(0))) {
            return "No";
        }
        return checkDigits(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Output: " + checkDigits(input));

        sc.close();
    }
}