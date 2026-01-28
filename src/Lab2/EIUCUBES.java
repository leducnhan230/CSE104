package Lab2;

import java.util.Scanner;

public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // bricks
        sc.close();

        int layers = 0;
        for (int i = 1;; i++) {
            double bricksOfLayer = i * (i + 1) / 2;

            n -= bricksOfLayer;
            if (n < 0)
                break;
            layers++;
        }
        System.out.println((int) Math.floor(layers));
    }
}
