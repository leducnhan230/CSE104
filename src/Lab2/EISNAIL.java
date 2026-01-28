package Lab2;

import java.util.Scanner;

public class EISNAIL {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int totalDays = (int) (1 + Math.ceil((double) (V - A) / (A - B)));
        System.out.println(totalDays);
    }

}
