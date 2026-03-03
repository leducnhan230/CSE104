package Lab5;

import java.util.Scanner;
import java.lang.Math;

public class EiuPassBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long principal = sc.nextLong();
        int enoughMonths = sc.nextInt();
        int lackMonths = sc.nextInt();
        double rateInterest = sc.nextDouble() / 100.0;
        double rateLoan = sc.nextDouble() / 100.0;
        sc.close();

        double totalAfterInterest = principal;
        // Interest received after n months;
        int year = (int) (enoughMonths / 12.0);
        for (int i = 1; i <= year; i++) {
            totalAfterInterest += totalAfterInterest * rateInterest;
        }
        totalAfterInterest += totalAfterInterest * rateInterest * (enoughMonths - year * 12)/ 12.0;

        // option 2:
        int yearLoan = (int) ((enoughMonths - lackMonths) / 12);
        int monthsLoan = (enoughMonths - lackMonths) - yearLoan * 12;
        double option2 = totalAfterInterest / (Math.pow(rateLoan, yearLoan) * (rateLoan * (monthsLoan / 12.0)) + 1);

        System.out.println(Math.round(Math.max(principal, option2)));
    }
}
