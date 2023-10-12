import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon2565 {

    static int[][] line;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        line = new int[N][2];
        dp = new Integer[N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(line, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int max = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(solve(i) , max);
        }

        System.out.println(N-max);
    }


    public static int solve(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N+1; i < dp.length; i++) {
                if (line[N][1] < line[i][1]) {
                    dp[N] = Math.max(dp[N], solve(i) + 1);
                }
            }
        }

        return dp[N];
    }
}
