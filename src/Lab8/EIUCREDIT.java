package Lab8;

import java.util.Scanner;

public class EIUCREDIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int transactions = sc.nextInt();
        double debtRate = sc.nextDouble();
        int paymentTerm = sc.nextInt();

        long[] creditCard = new long[paymentTerm + 1];
        for (int i = 0; i < transactions; i++) {
            int pointTransaction = sc.nextInt();
            creditCard[pointTransaction] += sc.nextLong();
        }

        double accountBalance = 0;
        double debtAmount = 0;
        for (int i = 1; i <= paymentTerm; i++) {
            if (i > 1 && (i - 1) % 30 == 0) {
                accountBalance += debtAmount / 30.0 * debtRate;
                debtAmount = 0;
            }
            accountBalance += creditCard[i];
            if (accountBalance < 0) {
                debtAmount += accountBalance;
            }
        }
        System.out.printf("%.2f", accountBalance);

        sc.close();
    }
}
