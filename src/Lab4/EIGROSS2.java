package Lab4;

import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long netSalary = sc.nextLong();
        sc.close();

        long[] levels = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000,
                Long.MAX_VALUE / 2 };
        double[] rates = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };

        int noTax = 11_000_000;
        long afterTax = netSalary - noTax;
        if (afterTax <= 0) {
            System.out.println(netSalary);
        } else {
            double progressive = 0;
            int index = 0;
            double temp = 0;
            for (int i = 1; i < levels.length; i++) {
                long portion = levels[i] - levels[i - 1];
                progressive += portion * (1 - rates[i - 1]);
                if (progressive > afterTax) {
                    index = i - 1;
                    break;
                }
                temp = progressive;

            }
            double extant = (afterTax - temp) / (1 - rates[index]);
            extant += levels[index];
            System.out.println(Math.round(extant + noTax));
        }

    }
}
