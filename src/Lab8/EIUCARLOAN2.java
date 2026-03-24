package Lab8;

import java.util.Scanner;

public class EIUCARLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double oldCP = sc.nextLong();
        long newCP = sc.nextLong();
        double downPayPercent = sc.nextDouble() / 100.0;
        int term = sc.nextInt();
        int sellingTime = sc.nextInt();
        double depreciationRate = sc.nextDouble() / 100.0;

        double loan = oldCP - oldCP * downPayPercent;
        double valueOldCareAfter44Months = oldCP * 0.9 * Math.pow(1 - depreciationRate, sellingTime - 1);
        double downPayment = newCP * downPayPercent;
        double debt0 = valueOldCareAfter44Months - downPayment;

        double high = 0.2;
        double low = 0;
        double middle = 0;
        while (high - low > Math.pow(10, -6)) {
            middle = (high + low) / 2;
            double R = 1 + middle;
            double G = (loan * Math.pow(R, term) * (R - 1)) / (Math.pow(R, term) - 1);
            double debt = loan * Math.pow(R, sellingTime - 1) - G * (Math.pow(R, sellingTime - 1) - 1) / (R - 1);
            if (debt > debt0) {
                high = middle;
            } else {
                low = middle;
            }
        }
        System.out.printf("%.4f", (low + high) * 6);
        sc.close();
    }
}
