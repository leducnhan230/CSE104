package Lab3;

import java.util.Scanner;

public class EiBankFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Nhập dữ liệu
        // Sử dụng double cho số dư và long cho số lượng tấm séc (vì có thể lên tới
        // 10^9)
        if (sc.hasNextDouble()) {
            double soDu = sc.nextDouble();
            long soSec = sc.nextLong();

            double phiThang = 0;
            double phiMoiSec = 0;

            // Bước 2: Phân loại dựa trên số dư trung bình
            if (soDu < 500) {
                phiThang = 12.0;
                phiMoiSec = 0.20;
            } else if (soDu < 2000) {
                phiThang = 7.5;
                phiMoiSec = 0.20;
            } else if (soDu < 5000) {
                phiThang = 5.0;
                phiMoiSec = 0.10;
            } else {
                phiThang = 0;
                phiMoiSec = 0;
            }

            // Bước 3: Tính tổng phí
            double tongPhi = phiThang + (soSec * phiMoiSec);

            // Bước 4: In kết quả
            // Kiểm tra nếu là số nguyên thì in số nguyên, nếu lẻ thì in 2 chữ số thập phân
            if (tongPhi == (long) tongPhi) {
                System.out.println((long) tongPhi);
            } else {
                System.out.printf("%.2f\n", tongPhi);
            }
        }
        sc.close();
    }
}
