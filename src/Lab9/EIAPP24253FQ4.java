package Lab9;

import java.util.Scanner;

public class EIAPP24253FQ4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input:
        int months = sc.nextInt();
        long housePrice = sc.nextLong();
        double loanRate = sc.nextDouble();

        double houseIncreasingRate[] = new double[8];
        for (int i = 0; i < 8; i++) {
            houseIncreasingRate[i] = sc.nextDouble();
        }

        double interestRate[] = new double[8];
        for (int i = 0; i < 8; i++) {
            interestRate[i] = sc.nextDouble();
        }

        // Calculate:
        double low = 0, high = housePrice;
        for (int binary = 0; binary < 100; binary++) {
            double mid = low + (high - low) / 2;

            double balance = mid;
            int loanPoint = -1;
            double housePriceIncreasing = housePrice * 1.0;

            // Stage 1:
            double loanAmount = 0;
            int idx = 0;
            for (int month = 1; month <= months; month++) {
                if (balance >= housePriceIncreasing * 0.3) {
                    loanAmount = housePriceIncreasing - balance;
                    loanPoint = month + 1;
                    break;
                }
                balance = balance * (1 + interestRate[idx]) + mid;
                housePriceIncreasing *= (1 + houseIncreasingRate[idx]);
                if (month % 60 == 0)
                    idx++;
            }

            if (loanPoint == -1)
                low = mid;
            else {
                // Stage 2:

                for (int i = loanPoint; i <= months; i++) {
                    loanAmount = loanAmount * (1 + loanRate) - mid;
                }

                if (loanAmount <= 0) {
                    high = mid;
                } else {
                    low = mid;
                }

            }
        }

        // Output:
        System.out.println(Math.round((high + low) / 2));
        sc.close();
    }
}
