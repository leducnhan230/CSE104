package Lab3;

import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        int[] levels = { 2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000, 200_000_000,
                Integer.MAX_VALUE / 2 };
        double[] rates = { 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalIncome = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            for (int j = 0; j < levels.length; j++) {
                if (value <= levels[j]) {
                    totalIncome += value - (value * rates[j]);
                    break;
                }

            }
        }
        sc.close();
        System.out.println(Math.round(totalIncome));
    }
}
