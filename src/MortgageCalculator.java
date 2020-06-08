import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual interest rate: ");
        float interest = input.nextFloat();

        System.out.print("Period (Years): ");
        int period = input.nextInt();

        float calculateInterest = (interest / 100) / 12;
        int numPayments = period * 12;



        double total = principal * (calculateInterest * (Math.pow((1 + calculateInterest), numPayments)) / (Math.pow(1 + calculateInterest, numPayments) - 1));
        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
        String result = mortgage.format(total); 
        System.out.println("Mortgage: " + result);
    }
}
