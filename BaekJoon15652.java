import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon15652 {

    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        bfs(1,0);

        System.out.println(sb);

    }

    public static void bfs(int at, int depth) {

        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            bfs(i,depth + 1);
        }
    }
}

// bfs(0)
// arr[0] = 1;
// bfs(1)
// arr[1] = 1;
// bfs(2)