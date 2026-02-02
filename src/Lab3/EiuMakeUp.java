package Lab3;

import java.util.Scanner;

public class EiuMakeUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long tongTien = 0;
        int giaHienTai = 200;

        for (int i = 1; i <= n; i++) {
            tongTien += giaHienTai;
            if (i % 100 == 0 && giaHienTai > 180) {
                giaHienTai--;
            }
        }
        System.out.println(tongTien);
        sc.close();
    }
}
