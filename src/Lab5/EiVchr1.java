package Lab5;

import java.util.Scanner;

public class EiVchr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalCost = sc.nextLong();

        double discount = totalCost * 0.3;
        int MAXIMUM = 50_000;
        if (discount > MAXIMUM) {
            totalCost -= MAXIMUM;
        } else {
            totalCost -= discount;
        }
        System.out.println(totalCost);
        sc.close();
    }

}
