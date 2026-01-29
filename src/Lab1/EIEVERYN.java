package Lab1;

import java.util.Scanner;

public class EIEVERYN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte T = sc.nextByte();
        for (int i = 1; i <= T; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            boolean[] arrN = new boolean[n + 1];
            for (int j = 1; j < n + 1; j++) {
                arrN[j] = false;
            }

            for (int j = 0; j < m; j++) {
                int ai = sc.nextInt();
                if (ai > 0 && ai <= n)
                    arrN[ai] = true;
            }
            boolean flag = true;
            for (int j = 1; j < n + 1; j++) {
                if (arrN[j] == false) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }

}
