import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24416 {

    static int cnt1;
    static int cnt2;
    static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        temp = new int[n];
        StringBuilder sb = new StringBuilder();

        fib(n);
        fibonacci(n);
        sb.append(cnt1).append(" ").append(cnt2);

        System.out.println(sb);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static int fibonacci(int n) {
        temp[0] = 1;
        temp[1] = 1;

        for (int i = 2; i < n; i++) {
            cnt2++;
            temp[i] = temp[i - 2] + temp[i - 1];
        }

        return temp[n - 1];
    }
}
