package Lab1;

import java.util.Scanner;

public class EIINCRDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        boolean flag = true;
        if (arr[1] > arr[0]) {
            // day tang
            for (int j = 2; j < arr.length; j++) {
                if (arr[j] <= arr[j - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("increasing");
            else
                System.out.println("none");
        }

        else if (arr[1] < arr[0]) {
            // day giam
            for (int j = 2; j < arr.length; j++) {
                if (arr[j] >= arr[j - 1])
                    flag = false;
            }
            if (flag)
                System.out.println("decreasing");
            else
                System.out.println("none");
        } else
            System.out.println("none");

    }

}
