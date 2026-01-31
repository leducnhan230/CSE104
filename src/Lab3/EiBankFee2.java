package Lab3;

import java.util.Scanner;

public class EiBankFee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double tongTatCaPhi = 0;
        long tongTatCaSec = 0;

        for (int i = 0; i < n; i++) {
            double soDu = sc.nextDouble();
            long soSec = sc.nextLong();

            double phiThang = 0;
            double phiMoiSec = 0;

            if (soDu < 500) {
                phiThang = 12.0;
                phiMoiSec = 0.2;
            } else if (soDu < 2000) {
                phiThang = 7.5;
                phiMoiSec = 0.2;
            } else if (soDu < 5000) {
                phiThang = 5.0;
                phiMoiSec = 0.1;
            } else {
                phiThang = 0;
                phiMoiSec = 0;
            }

            double phiTaiKhoanNay = phiThang + (soSec * phiMoiSec);
            tongTatCaPhi += phiTaiKhoanNay;
            tongTatCaSec += soSec;
        }

        if (tongTatCaSec > 0) {
            System.out.println(tongTatCaPhi / tongTatCaSec);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
