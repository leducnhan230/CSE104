package Lab7;

import java.util.Scanner;

public class EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long originalPrice = sc.nextLong();
        long prepayMoney = sc.nextLong();
        byte months = sc.nextByte();
        double rate = sc.nextDouble();
        sc.close();

        long initialLoanAmount = originalPrice - prepayMoney;
        double monthlyPayment = (initialLoanAmount * Math.pow(rate + 1, months) * ((rate + 1) - 1))
                / (Math.pow(rate + 1, months)
                        - 1);
        System.out.println((long) Math.floor(monthlyPayment));
    }
}
