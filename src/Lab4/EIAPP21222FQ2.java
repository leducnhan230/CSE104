package Lab4;

import java.util.Scanner;

public class EIAPP21222FQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();

        double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692 };
        double totalMoney = 0;
        for (int i = 0; i < months; i++) {
            long deposits = sc.nextLong();
            totalMoney += deposits;
            totalMoney += totalMoney * (rates[i] / 12.0);
        }
        System.out.println(Math.round(totalMoney));
        sc.close();
    }
}
