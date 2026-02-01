package Lab3;

import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        long[] levels = { 5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000, 900_000_000,
                Long.MAX_VALUE / 2 };
        double[] rates = { 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        double noelDiscount = 0;
        if (n <= 5_000_000)
            noelDiscount = 0;
        else
            for (int i = 1; i < levels.length; i++) {
                if (n > levels[i - 1]) {
                    long portion = Math.min(n, levels[i]) - levels[i - 1];
                    noelDiscount += portion * rates[i - 1];
                }
            }
        n -= Math.round(noelDiscount);

        double tetDiscount = 0.02;
        int onl = sc.nextInt();
        if (onl == 1) {
            n -= n * tetDiscount;
        }
        int vip = sc.nextInt();
        if (vip == 1) {
            n -= n * tetDiscount;
        }
        int card = sc.nextInt();
        if (card == 1) {
            n -= n * tetDiscount;
        }
        sc.close();
        /*
         * output:
         * số tiền khách hàng phải trả.
         */
        System.out.println(n);
    }
}
