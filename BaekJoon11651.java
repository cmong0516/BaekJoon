import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr,(i1,i2) -> {
            if (i1[1] == i2[1]) {
                return i1[0] - i2[0];
            } else {
                return i1[1] - i2[1];
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
