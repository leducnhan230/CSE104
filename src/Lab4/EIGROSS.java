package Lab4;

import java.util.Scanner;

public class EIGROSS {
    static Scanner sc = new Scanner(System.in);

    public static void AmountTaxPayMent() {
        double netSalary = sc.nextDouble();
        double grossSalary = netSalary / (1 - 0.1);
        System.out.println(grossSalary * 0.1);
    }

    public static void main(String[] args) {
        int numberPeople = sc.nextInt();
        for (int i = 0; i < numberPeople; i++) {
            AmountTaxPayMent();
        }
    }
}
