import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] treeArr = new int[n];

        for (int i = 0; i < n; i++) {
            treeArr[i] =  sc.nextInt();
        }

        Arrays.sort(treeArr);

        int min = 0;
        int max = 0;

        while (min < max) {

            int mid = (min + max) /2;

            long treeSum = 0;

            for (int i : treeArr) {
                if (i - mid > 0) {
                    treeSum += (i - mid);
                }
            }

            if (treeSum < m) {
                max = mid;
            } else {
                min = mid +1;
            }

        }

        System.out.println(min-1);

    }
}
