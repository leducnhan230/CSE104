package Lab8;

import java.util.Scanner;

public class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long housePrice = sc.nextLong();
        long principal = sc.nextLong();
        int months = sc.nextInt();
        double bankRate = sc.nextDouble() / 100.0;
        sc.close();

        double initialLoanAmount = housePrice - principal;
        double monthlyPayment = initialLoanAmount / months;
        for (int i = 1; i <= months; i++) {
            double bankInterest = initialLoanAmount * bankRate;
            double totalMonthlyPayment = monthlyPayment + bankInterest;
            initialLoanAmount -= monthlyPayment;
            System.out.println(i + " " + Math.round(totalMonthlyPayment));
        }
    }
}
