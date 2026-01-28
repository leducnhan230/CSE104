package Lab2;

import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        int unit = 1_000_000;
        double noelDiscount = 0;
        if (n < 5 * unit)
            noelDiscount = 0;
        else if (n <= 20 * unit)
            noelDiscount = (n - 5 * unit) * 0.03;
        else if (n <= 100 * unit)
            noelDiscount = (n - 20 * unit) * 0.05 + (15 * unit * 0.03);
        else if (n <= 300 * unit)
            noelDiscount = (n - 100 * unit) * 0.07 + (15 * unit * 0.03) + (80 * unit * 0.05);
        else if (n <= 600 * unit)
            noelDiscount = (n - 300 * unit) * 0.1 + (15 * unit * 0.03) + (80 * unit * 0.05) + (200 * unit * 0.07);
        else if (n <= 900 * unit)
            noelDiscount = (n - 600 * unit) * 0.12 + (15 * unit * 0.03) + (80 * unit * 0.05) + (200 * unit * 0.07)
                    + (300 * unit * 0.1);
        else
            noelDiscount = (n - 900 * unit) * 0.15 + (15 * unit * 0.03) + (80 * unit * 0.05) + (200 * unit * 0.07)
                    + (300 * unit * 0.1) + (300 * unit * 0.12);
        n -= noelDiscount;

        System.out.println(n);
    }
}