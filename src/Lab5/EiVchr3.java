package Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class EiVchr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberItems = sc.nextInt();
        int numberVoucher = sc.nextInt();

        int[] itemPrices = new int[numberItems];
        long totalCost = 0;
        for (int i = 0; i < itemPrices.length; i++) {
            itemPrices[i] = sc.nextInt();
            totalCost += itemPrices[i];
        }
        // Ascending
        Arrays.sort(itemPrices);

        int MAX_DISCOUNT = 50_000;
        double DISCOUNT_RATE = 0.3;

        // Number of voucher will apply for the number of greatest number
        int vouchersToUse = Math.min(numberItems, numberVoucher);
        for (int i = 0; i < vouchersToUse; i++) {
            double discount = Math.min(itemPrices[itemPrices.length - 1 - i] * DISCOUNT_RATE, MAX_DISCOUNT);
            totalCost -= discount;
        }
        System.out.println(totalCost);
        sc.close();
    }
}
