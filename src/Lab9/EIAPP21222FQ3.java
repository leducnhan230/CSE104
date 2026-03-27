
package Lab9;

import java.util.Scanner;

public class EIAPP21222FQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long goal = sc.nextLong();
        int months = sc.nextInt();

        double[] RATES = { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692, Double.MAX_VALUE / 2 };
        double principal = 0;
        double interest = 0;
        for (int i = months; i > 0; i--) {
            interest += Math.pow(1 + RATES[i] / 12, i);
        }
        principal = goal / interest;
        System.out.printf("%.4f", principal);
        sc.close();
    }
}