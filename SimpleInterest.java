
import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter principle:");
        double principle = scanner.nextDouble();

        System.out.println("Enter rate:");
        double rate = scanner.nextDouble();

        System.out.println("Enter time:");
        double time = scanner.nextDouble();

        double interest = (principle*rate*time);

        System.out.println("Simple Interest is:"+interest);

        scanner.close();


    }
}