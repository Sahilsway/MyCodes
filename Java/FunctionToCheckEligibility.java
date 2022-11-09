import java.util.Scanner;

public class FunctionToCheckEligibility {
    public static boolean Check(int age) {
        if (age >= 18) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the person : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if (Check(age) == true) {
            System.out.print(name + " is eligible to vote");
        } else
            System.out.print(name + " is not elgible to vote");
    }
}
