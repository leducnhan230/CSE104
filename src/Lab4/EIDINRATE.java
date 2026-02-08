package Lab4;

import java.util.Scanner;

public class EIDINRATE {
    static Scanner sc = new Scanner(System.in);

    public static int YearGoal() {
        double principal = sc.nextDouble();
        double rates = sc.nextDouble() / 100.0;
        double goal = sc.nextDouble();

        int years = 0;
        while (principal < goal) {
            principal += principal * rates;
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        // testcases:
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(YearGoal());
        }
    }
}
