import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();

        // UPPER-PART
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            // SPACE
            int spaces = 2 * (n - i);
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // LOWER-PART
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            // SPACE
            int spaces = 2 * (n - i);
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
