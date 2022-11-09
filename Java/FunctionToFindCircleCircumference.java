import java.util.Scanner;

public class FunctionToFindCircleCircumference {
    public static void Calculate(float r) {
        double ans = 2 * 3.14 * r;
        System.out.print("The circumference of the circle is : " + ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = sc.nextFloat();

        Calculate(r);
    }
}
