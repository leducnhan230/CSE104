package Lab2;
import java.util.Scanner;

public class EIUMADIS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = input();
        System.out.println(minus(arr));
    }

    public static long[] input() {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static long minus(long[] arr) {
        long maxDifference = 0;
        long minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue)
                minValue = arr[i];
            long currentDiff = arr[i] - minValue;
            if (currentDiff > maxDifference)
                maxDifference = currentDiff;
        }
        return maxDifference;
    }

}
