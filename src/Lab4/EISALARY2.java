package Lab4;

import java.util.Scanner;

public class EISALARY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // office
        double hourlyOffice = 0;
        double totalPayOffice = 0;

        // overtime
        double hourlyOver = 0;
        double totalPayOver = 0;

        // input:
        for (int i = 0; i < n; i++) {
            double[] workingHours = new double[5];
            for (int j = 0; j < workingHours.length; j++)
                workingHours[j] = sc.nextDouble();
            double hourlyWages = sc.nextDouble();

            // calculate
            double totalWages = 0; // wages per person
            for (int j = 0; j < workingHours.length; j++) {

                if (workingHours[j] <= 8) {
                    totalWages += workingHours[j] * hourlyWages;
                    // office
                    hourlyOffice += workingHours[j];
                    totalPayOffice += workingHours[j] * hourlyWages;
                }

                else {
                    totalWages += 8 * hourlyWages + (workingHours[j] - 8) * 1.5 * hourlyWages;
                    // office
                    hourlyOffice += 8;
                    totalPayOffice += 8 * hourlyWages;
                    // overtime
                    hourlyOver += workingHours[j] - 8;
                    totalPayOver += (workingHours[j] - 8) * 1.5 * hourlyWages;
                }

            }
            System.out.println((int) (totalWages * 100) / 100d);
        }
        sc.close();
        System.out.println((int) ((totalPayOffice / hourlyOffice) * 100) / 100d);
        System.out.println((int) ((totalPayOver / hourlyOver) * 100) / 100d);

    }
}
