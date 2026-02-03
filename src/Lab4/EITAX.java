package Lab4;

import java.util.Scanner;

public class EITAX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long grossSalary = sc.nextLong();
        sc.close();

        long[] levels = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000,
                Long.MAX_VALUE / 2 };
        double[] rates = { 0.05, 0.1, 0.15, 0.20, 0.25, 0.3, 0.35 };

        int PERSONAL_RELIEF = 9_000_000;
        long afterPR = grossSalary - PERSONAL_RELIEF;
        if (afterPR <= 0) {
            System.out.println(0);
        } else {
            double taxPayment = 0;
            for (int i = 1; i < levels.length; i++) {
                if (afterPR > levels[i - 1]) {
                    long portion = Math.min(afterPR, levels[i]) - levels[i - 1];
                    taxPayment += portion * rates[i - 1];
                }
            }
            System.out.println(Math.round(taxPayment));
        }
    }
}
