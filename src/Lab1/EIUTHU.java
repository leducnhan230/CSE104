package Lab1;

import java.util.Scanner;

public class EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fistLine = sc.nextLine();
        String secondline = sc.nextLine();

        int i = 1;
        int lap = 0;
        while (i <= fistLine.length() && i <= secondline.length()) {
            if (fistLine.substring(fistLine.length() - i).equals(secondline.substring(0, i)))
                lap = i;
            i++;
        }
        System.out.println(fistLine.length() + secondline.length() - lap);
        sc.close();
    }
}
