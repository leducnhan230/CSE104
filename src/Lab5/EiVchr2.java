package Lab5;

import java.util.Scanner;

public class EiVchr2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalItems = sc.nextInt();
        int[] pricesOfItems = new int[totalItems];
        int greatest = -1;
        for (int i = 0; i < pricesOfItems.length; i++) {
            pricesOfItems[i] = sc.nextInt();
            if (greatest < pricesOfItems[i]) {
                greatest = pricesOfItems[i];
            }
        }

        int MAX_DISCOUNT = 50_000;
        double DISCOUNT_RATE = 0.3;
        long totalCost = 0;
        for (int i = 0; i < pricesOfItems.length; i++) {
            totalCost += pricesOfItems[i];
        }
        // Maximum at 50_000
        totalCost -= Math.min(greatest * DISCOUNT_RATE, MAX_DISCOUNT);
        System.out.println(totalCost);
        sc.close();
    }
}
