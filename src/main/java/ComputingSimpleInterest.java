import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        double worth = principal*(1 + (rate/100)*years);
        String output = String.format("After %d years at %.2f%%, the investment will be worth $%.2f",
                                    years, rate, worth);
        System.out.println(output);
    }
}
