package Lab4;

import java.util.Scanner;

public class EIAPP21222FQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        double[] rates = { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692 };
        double maxMoney = 0;
        if (m > 12) {
            int year = Math.floorDiv(m, 12);
            int months = m - (year * 12);
            maxMoney = n;
            for (int i = 1; i <= year; i++) {
                maxMoney += maxMoney * 0.0692;
            }
            maxMoney *= ((rates[months] * months / 12.0) + 1);
        }

        else {
            maxMoney = n * (rates[m] * m / 12.0) + n;
        }
        System.out.println(Math.round(maxMoney));

    }
}
