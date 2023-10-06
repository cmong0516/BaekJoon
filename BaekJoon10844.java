import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10844 {
    static Long[][] dp;
    static int N;
    static long M = 1000000000;

    public static void main(String[] args) throws IOException {
        // 10 12 21 23 32 34 43 45 54 56 65 67 76 78 87 89 98

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new Long[N+1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += solve(N, i);
        }

        System.out.println(result % M);
    }


    public static long solve(int digit, int value) {

        if (digit == 1) {
            return dp[digit][value];
        }

        if (dp[digit][value] == null) {
            if (value == 0) {
                dp[digit][value] = solve(digit - 1, 1);
            } else if (value == 9) {
                dp[digit][value] = solve(digit - 1, 8);
            } else {
                dp[digit][value] = solve(digit - 1, value + 1) + solve(digit - 1, value - 1);
            }
        }

        return dp[digit][value] % M;
    }
}

// solve(2,1) -> solve(1,2) + solve(1,0)
//                   1      +     1       =2;
// solve(2,2) -> solve(1,3) + solve(1,1)
//                   1           1        = 2;
// solve(2,9) -> solve(1,8)        = 1;