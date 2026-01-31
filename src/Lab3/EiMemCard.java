package Lab3;

import java.util.Scanner;

class EiMemCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] levels = { 1000000, 20000000, 50000000, 200000000, Long.MAX_VALUE };
        double[] rates = { 0, 0.02, 0.03, 0.05, 0.07 };
        double total = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long buy = sc.nextLong();
            for (int j = 0; j < levels.length; j++) {
                if (total < levels[j]) {
                    sb.append(buy * rates[j]).append(" ");
                    break;
                }
            }
            total += buy;
        }
        System.out.println(sb.toString());
        sc.close();
    }
}