package Lab2;

import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFinger(n));
        sc.close();
    }

    public static String findFinger(int n) {
        String[] fingers = { "cai", "tro", "giua", "ap ut", "ut" };
        String[] hands = { "trai", "phai" };

        int result = n % 18;
        if (result > 10) {
            result = 20 - result;
        }

        int handIndex;
        if (result > 5) {
            handIndex = 1;
            result = 11 - result;
        } else {
            handIndex = 0;
        }

        int fingerIndex;
        if (result == 0) {
            fingerIndex = 1;
        } else {
            fingerIndex = result - 1;
        }

        return "Ngon " + fingers[fingerIndex] + " cua ban tay " + hands[handIndex];
    }

}
