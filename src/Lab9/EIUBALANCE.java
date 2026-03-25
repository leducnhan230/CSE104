package Lab9;

import java.util.Scanner;

public class EIUBALANCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();

        int monthlySalary[] = new int[months * 2];
        for (int i = 0; i < months; i++) {
            monthlySalary[i] = sc.nextInt();
        }

        int expense = sc.nextInt();
        double bankRate = sc.nextDouble() / 100 / 12;
        double inflationRate = sc.nextDouble() / 100 / 12;

        double remainingMoney = 0;
        for (int i = 0; i < monthlySalary.length; i++) {
            double monthlyExpenditure = expense * Math.pow(1 + inflationRate, i);
            remainingMoney += monthlySalary[i] - monthlyExpenditure;
            remainingMoney *= (1 + bankRate);
        }

        if (remainingMoney < 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.round(remainingMoney));
        }
        sc.close();
    }
}
