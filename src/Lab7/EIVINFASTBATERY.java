package Lab7;

import java.util.Scanner;

public class EIVINFASTBATERY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int valueRecalledBattery = sc.nextInt();
        int months = sc.nextInt();
        double rate = sc.nextDouble() / 100.0;
        sc.close();

        double rentBatteryAmount = ((principal * Math.pow(1 + rate, months) - valueRecalledBattery)
                / (Math.pow(1 + rate, months) - 1)) * rate;
        System.out.println(Math.round(rentBatteryAmount));
    }

}
