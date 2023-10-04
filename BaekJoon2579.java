import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2579 {

    static int[] arr;
    static Integer[]dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        arr = new int[T+1];
        dp = new Integer[T+1];



        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Arrays.toString(arr));

        dp[0] = arr[0];
        dp[1] = arr[1];

        if (T >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(find(T));
    }

    public static int find(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
        }

        return dp[N];
    }
}
