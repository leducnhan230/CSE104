package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class EiAuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        byte groupSize = sc.nextByte();
        byte[] outcomes = new byte[groupSize + 1];
        for (int i = 1; i < outcomes.length; i++) {
            outcomes[i] = sc.nextByte();
        }

        // asscending
        byte[] sorted = outcomes.clone();
        Arrays.sort(sorted);

        // file the greatest and unique number
        int winnerOutcome = -1;

        for (int i = 1; i < sorted.length; i++) {
            boolean isUnique = true;
            if (i > 1 && sorted[i] == sorted[i - 1]) {
                isUnique = false;
            }
            if (i < sorted.length - 1 && sorted[i] == sorted[i + 1]) {
                isUnique = false;
            }
            if (isUnique) {
                winnerOutcome = sorted[i];
            }
        }

        // output
        if (winnerOutcome <= 0) {
            System.out.println("none");
        } else {
            for (int i = 1; i < outcomes.length; i++) {
                if (outcomes[i] == winnerOutcome) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
