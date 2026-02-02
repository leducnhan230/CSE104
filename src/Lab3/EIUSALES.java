package Lab3;

import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        int[] levels = { 0, 20, 50, 200, 500, 2000, Integer.MAX_VALUE / 2 };
        double[] rates = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        double bonus = 0;
        for (int i = 1; i < levels.length; i++) {
            if (n > levels[i - 1]) {
                long portion = Math.min(n, levels[i]) - levels[i - 1];
                bonus += portion * rates[i - 1];
            }
        }
        System.out.printf("%.3f", bonus);
        // System.out.println((int) (bonus * 1000) / 1000.0);

    }
}
