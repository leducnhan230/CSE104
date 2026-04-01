package Lab9;

import java.util.Scanner;
import java.lang.Math;

public class EIAPP24252FQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long oldCarPrice = sc.nextLong();
        long newCarPrice = sc.nextLong();
        double downPayRate = sc.nextDouble() / 100;
        int loanMonths = sc.nextInt();
        double loanRate = sc.nextDouble() / 100 / 12;
        double depreciationRate = sc.nextDouble() / 100;

        double downPayNew = downPayRate * newCarPrice;
        double loanAmount = oldCarPrice * (1 - downPayRate);
        double monthlyPayment = loanAmount * Math.pow(1 + loanRate, loanMonths) * loanRate
                / (Math.pow(1 + loanRate, loanMonths) - 1);

        long low = 0, high = loanMonths;
        long ans = high;

        double remainingLoan = 0;
        double sellingCar = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            sellingCar = oldCarPrice * 0.9 * Math.pow(1 - depreciationRate, mid);

            remainingLoan = loanAmount * Math.pow(1 + loanRate, mid)
                    - monthlyPayment * ((Math.pow(1 + loanRate, mid) - 1) / loanRate);

            if (sellingCar >= remainingLoan + downPayNew) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        sellingCar = oldCarPrice * 0.9 * Math.pow(1 - depreciationRate, ans);
        remainingLoan = loanAmount * Math.pow(1 + loanRate, ans)
                - monthlyPayment * ((Math.pow(1 + loanRate, ans) - 1) / loanRate);

        System.out.println(ans);
        if (sellingCar < remainingLoan + downPayNew) {
            System.out.println(Math.abs((sellingCar - remainingLoan) - downPayNew));
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
