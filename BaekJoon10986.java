import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long sum = 0;
        long count[] = new long[M];
        long result = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            sum += Integer.parseInt(st.nextToken());
            sum %= M;
            count[(int) sum]++;
        }

        result += count[0];

        for (int i = 0; i < M; i++) {
            result += (count[i] * (count[i]-1))/2;
        }

        System.out.println(result);


    }
}
