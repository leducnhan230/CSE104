package Lab1;

import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte point = sc.nextByte();
        sc.close();

        int[] scores = new int[] { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] scoreWords = new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };

        for (int i = 0; i < scores.length; i++) {
            if (point >= scores[i]) {
                System.out.println(scoreWords[i]);
                break;
            }
        }
    }
}
