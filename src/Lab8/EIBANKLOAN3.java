package Lab8;

import java.util.Scanner;

public class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double loan = sc.nextDouble();
        long maxMonPay = sc.nextLong();
        int months = sc.nextInt();
        double bRate = sc.nextDouble() / 100.0 / 12.0;
        double pRate = sc.nextDouble() / 100.0;

        double monPay = loan / months;
        double prepay = 0;
        for (int i = 1; i <= months; i++) {
            double principal = Math.max(monPay - prepay, 0);
            double bInterest = loan * bRate;

            prepay = (maxMonPay - bInterest - principal) / (1 + pRate);
            loan -= principal + prepay;
            
            if (loan <= 0) {
                System.out.println(i + " " + 0);
                break;
            }
            
            System.out.println(i + " " + Math.round(loan));
        }
        sc.close();
    }
}
