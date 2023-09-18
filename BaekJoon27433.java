import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon27433 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long N = Long.parseLong(br.readLine());
// for
//        for (int i = 1; i <= N; i++) {
//            answer *= i;
//        }

        // 재귀

        long factorial = factorial(N);

        System.out.println(factorial);
    }

    public static long factorial(long N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }
}
