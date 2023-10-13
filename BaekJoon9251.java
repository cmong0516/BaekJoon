import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9251 {

    static char[] chars1;
    static char[] chars2;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        chars1 = br.readLine().toCharArray();
        chars2 = br.readLine().toCharArray();

        dp = new Integer[chars1.length][chars2.length];

        System.out.println(lcs(chars1.length-1, chars2.length-1));

    }

    public static int lcs(int x, int y) {
        if (x == -1 || y == -1) {
            return 0;
        }

        if (dp[x][y] == null) {
            dp[x][y] = 0;

            if (chars1[x] == chars2[y]) {
                dp[x][y] = lcs(x - 1, y - 1) + 1;
            } else {
                dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
            }
        }

        return dp[x][y];
    }
}
