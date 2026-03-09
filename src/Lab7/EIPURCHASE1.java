package Lab7;

import java.util.Scanner;

public class EIPURCHASE1 {
    public static double Calculate(long G, double mid, long X, byte months) {
        return X * Math.pow(mid + 1, months) - G * ((Math.pow(mid + 1, months) - 1) / ((mid + 1) - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long productValue = sc.nextLong();
        byte months = sc.nextByte();
        long downPayment = sc.nextLong();
        long monthlyPayment = sc.nextLong();
        sc.close();

        long initialLoanAmount = productValue - downPayment;

        double low = 0;
        double high = 1.0;
        while (high - low > Math.pow(10, -7)) {
            double mid = (high + low) / 2;
            double debt = Calculate(monthlyPayment, mid, initialLoanAmount, months);
            if (debt > 0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.printf("%.3f", (high + low) / 2);
    }
}
