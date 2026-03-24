package Lab8;

import java.util.Scanner;

public class EIUCARLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long oldCarPrice = sc.nextLong();
        long newCarPrice = sc.nextLong();
        double downPaymentRate = sc.nextDouble() / 100;
        double loanMonths = sc.nextDouble();
        int carSellingPoint = sc.nextInt();
        double depreciationRate = sc.nextDouble() / 100;

        double loanAmount = oldCarPrice * (1 - downPaymentRate);

        double sellingCar = oldCarPrice * 0.9 * Math.pow(1 - depreciationRate, carSellingPoint - 1);
        double downPaymentNew = downPaymentRate * newCarPrice;

        double low = 0, high = 0.2;
        for (int i = 0; i < 100; i++) {
            double mid = low + (high - low) / 2;

            double monthlyPayment = loanAmount * Math.pow(1 + mid, loanMonths) * (mid)
                    / (Math.pow(1 + mid, loanMonths) - 1);

            double oldLoanRemaining = loanAmount * Math.pow(1 + mid, carSellingPoint - 1)
                    - monthlyPayment * (Math.pow(1 + mid, carSellingPoint - 1) - 1) / (mid);

            if (sellingCar - downPaymentNew - oldLoanRemaining < 0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.printf("%.4f", (high + low) * 6);

        sc.close();
    }
}
