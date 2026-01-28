package Lab2;

import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // type of bricks
        long[] brickTypes = new long[T];
        for (int i = 0; i < T; i++) {
            brickTypes[i] = sc.nextLong();
            brickTypes[i] = layers(brickTypes[i]);
        }
        sc.close();

        for (long t : brickTypes)
            System.out.print(t + " ");
    }

    public static int layers(long n) {
        int layers = 0;
        for (int i = 1;; i++) {
            double bricksOfLayer = i * (i + 1) / 2;

            n -= bricksOfLayer;
            if (n < 0)
                break;
            layers++;
        }
        return layers;
    }
}
