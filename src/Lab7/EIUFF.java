package Lab7;

import java.util.Scanner;

public class EIUFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double investmentRate = sc.nextDouble() / 100;
        double inflationRate = sc.nextDouble() / 100;
        int fistWithdraw = sc.nextInt();
        int months = sc.nextInt();
        sc.close();

        double commonRatio = (1 + inflationRate) / (1 + investmentRate);
        double principal;
        if (inflationRate != investmentRate) {
            principal = (fistWithdraw / (1 + investmentRate))
                    * ((1 - Math.pow(commonRatio, months - 1)) / (1 - commonRatio));
        } else {
            principal = (fistWithdraw / (1 + investmentRate))
                    * (months - 1);
        }
        System.out.println(Math.round(principal*10000)/10000.0);
    }
}
