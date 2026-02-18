package Lab5;

import java.util.Scanner;

public class EiInterest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bankRate = sc.nextDouble();
        double totalEachMonth = 0;
        for (int i = 0; i < 12; i++) {
            int deposits = sc.nextInt();
            totalEachMonth += deposits;
            totalEachMonth = totalEachMonth * (bankRate + 1);
        }
        System.out.println(Math.round(totalEachMonth));
        sc.close();
    }
}
