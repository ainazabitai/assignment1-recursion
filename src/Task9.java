import java.util.Scanner;

public class Task9 {
    public static int countCharacters(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + countCharacters(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String s = sc.nextLine();

        System.out.println(countCharacters(s));
    }
}
