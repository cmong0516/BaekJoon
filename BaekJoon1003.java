import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1003 {

    static int[][] arr = new int[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;


        for (int i = 2; i < 41; i++) {
            fibonacci(i);
        }

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(arr[n][0] + " " + arr[n][1]);
        }


    }

    public static void fibonacci(int n) {
        arr[n][0] = arr[n-1][0] + arr[n-2][0];
        arr[n][1] = arr[n-1][1] + arr[n-2][1];
    }
}
