package Lab1;

import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int[] bankNotes = new int[] { 20, 10, 5, 1 };
        for (int i = 0; i < bankNotes.length; i++) {
            if (money >= bankNotes[i]) {
                System.out.println(bankNotes[i] + " " + money / bankNotes[i]);
                money -= bankNotes[i] * (money / bankNotes[i]);
            }
        }
        sc.close();
    }
}
