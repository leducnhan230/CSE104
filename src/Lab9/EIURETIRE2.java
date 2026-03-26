package Lab9;

import java.util.Scanner;

public class EIURETIRE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int workMonths = sc.nextInt();
        double profitRate = sc.nextDouble() / 100 / 12;
        double inflationRate = sc.nextDouble() / 100 / 12;

        long monthlySalary[] = new long[1200];
        for (int i = 0; i < workMonths; i++) {
            monthlySalary[i] = sc.nextLong();
        }

        double low = 0, high = 1e15;
        int j = 0;
        while (j < 100) {
            double mid = low + (high - low) / 2;

            double balance = 0;
            double expense = mid;
            for (int i = 0; i < 1200; i++) {
                balance *= (1 + profitRate);
                balance += monthlySalary[i] - expense;
                expense *= (1 + inflationRate);
            }

            if (balance <= 0) {
                high = mid;
            } else {
                low = mid;
            }
            j++;
        }
        System.out.println((long) Math.floor((high + low) / 2));
        sc.close();
    }
}
