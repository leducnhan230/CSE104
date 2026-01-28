package Lab2;

import java.util.Scanner;

public class EIDISCOU {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double totalDiscount = 0;
        sc.close();
        double[] money = new double[] { 2_000_000, 10_000_000, 50_000_000, 100_000_000, 200_000_000, 500_000_000,
                Long.MAX_VALUE };
        double[] discountRate = new double[] { 0.03, 0.05, 0.07, 0.10, 0.12, 0.15 };
        for (int i = 0; i < discountRate.length; i++) {
            if (n > money[i]) {
                if (n > money[i + 1]) {
                    totalDiscount += (money[i + 1] - money[i]) * discountRate[i];
                } else {
                    totalDiscount += (n - money[i]) * discountRate[i];
                }
            }
        }
        System.out.println(Math.round(n - totalDiscount));
    }
}
