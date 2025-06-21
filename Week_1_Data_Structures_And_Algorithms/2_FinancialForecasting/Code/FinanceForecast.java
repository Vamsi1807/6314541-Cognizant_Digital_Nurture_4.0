
import java.util.Scanner;
public class FinanceForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double initialInvestment = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = compoundInterest(initialInvestment, annualInterestRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
    }

    public static double compoundInterest(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return compoundInterest(principal * (1 + rate / 100), rate, years - 1);
    }
}
