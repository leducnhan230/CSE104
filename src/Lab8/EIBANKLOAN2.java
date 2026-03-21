package Lab8;

import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialLoanAmount = sc.nextDouble();
        long monthlyPayment = sc.nextLong();
        double bankRate = sc.nextDouble() / 100.0 / 12.0;

        int months = 0;
        for (int i = 1; initialLoanAmount > 0; i++) {
            double bankInterest = initialLoanAmount * bankRate;
            initialLoanAmount -= monthlyPayment - bankInterest;
            months = i;
        }
        System.out.println(months);
        sc.close();
    }
}
