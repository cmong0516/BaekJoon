import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length - 1];

        // 거리가 늘어난다 = 공유기 갯수가 준다.
        // 거리가 줄어든다 = 공유기 갯수가 는다.
    }
}
