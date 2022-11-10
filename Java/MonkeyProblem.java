
import java .util.*;

public class MonkeyProblem {

    public static boolean isPerfectSquare(int num) {
        int sr = (int)Math.sqrt(num);
        if (sr * sr == num) {
            return true;
        }
        return false;
    }

    public static void fn(int num) {
        if (isPerfectSquare(num)) {
            System.out.print("The door is open");
        } else {
            System.out.print("Door is Closed");
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num<=0) {
            System.out.println("Invalid number!");
        } else {
            fn(num);
        }
    }
}
