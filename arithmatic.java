import java.util.Scanner;
public class arithmatic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Addition:"+ (num1+num2));
        System.out.println("Substraction:"+ (num1-num2));
        System.out.println("multiphication:"+ (num1*num2));
        System.out.println("Divide:"+ (num1/num2));
        System.out.println("Modulus:"+ (num1%num2));

        scanner.close();


    }

}