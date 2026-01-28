package Lab2;

import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * input:
         * T: so luong testcase
         * B qua xanh, R qua do.
         * Gia moi qua xanh la X, do la Y. do => xanh la Z.
         */

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            long B = sc.nextLong();
            long R = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();

            long minPayment_1 = B * X + R * Y;
            long minPayment_2 = (B + R) * X + R * Z;
            if (minPayment_1 > minPayment_2)
                minPayment_1 = minPayment_2;
            long minPayment_3 = (B + R) * Y + B * Z;
            if (minPayment_1 > minPayment_3)
                minPayment_1 = minPayment_3;
            System.out.println(minPayment_1);
        }
        sc.close();
    }
}
