import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int index = 0; index < m; index++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int l = i-1; l <j; l++) {
                arr[l] = k;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
