import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11054 {

    static Integer[] lisDp;
    static Integer[] ldsDp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N];
        lisDp = new Integer[N];
        ldsDp = new Integer[N];

        // 1  5 2 1 4 3 4 5 2 1
        // lis 는 증가
        // lds 는 감소

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            lis(i);
            lds(i);
        }

        int max = -1;

        for (int i = 0; i < N; i++) {
            max = Math.max(lisDp[i] + ldsDp[i], max);
        }

        System.out.println(max -1);

    }

    public static int lis(int N) {
        if (lisDp[N] == null) {
            lisDp[N] = 1;

            for (int i = N-1; i >= 0 ; i--) {
                if (arr[i] < arr[N]) {
                    lisDp[N] = Math.max(lisDp[N], lis(i) + 1);
                }
            }
        }

        return lisDp[N];
    }

    public static int lds(int N) {
        if (ldsDp[N] == null) {
            ldsDp[N] = 1;
        }

        for (int i = N+1; i <ldsDp.length ; i++) {
            if (arr[i] < arr[N]) {
                ldsDp[N] = Math.max(ldsDp[N], lds(i) + 1);
            }
        }

        return ldsDp[N];
    }
}
