package Lab4;

import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long principal = sc.nextLong();
        byte months = sc.nextByte();
        sc.close();

        double total = principal * ((9 / 100.0 * months / 12.0) + 1);

        System.out.println(total);
    }
}
