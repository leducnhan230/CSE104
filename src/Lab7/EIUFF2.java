package Lab7;

import java.util.Scanner;

public class EIUFF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double interestRate = sc.nextDouble() / 100;
        double inflationaryRate = sc.nextDouble() / 100;
        int firstWithdraw = sc.nextInt();

        System.out.println((int) Math.ceil(firstWithdraw / (interestRate - inflationaryRate)));
        sc.close();
    }
}
