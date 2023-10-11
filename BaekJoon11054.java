import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11054 {

    static Integer[] lisDp;
    static Integer[] ldsDp;
    static int[] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
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

        lis();
        lds();

        int max = 0;

        for (int i = 0; i < N; i++) {
            if (max < lisDp[i] + ldsDp[i]) {
                max = lisDp[i] + ldsDp[i];
            }
        }

        System.out.println(max - 1);

    }

    static void lis() {
        for (int i = 0; i < N; i++) {
            lisDp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && lisDp[i] < lisDp[j] + 1) {
                    lisDp[i] = lisDp[j] +1;
                }
            }
        }
    }

    static void lds() {
        for (int i = N-1; i >= 0; i--) {
            ldsDp[i] = 1;

            for (int j = N-1; j > i ; j--) {
                if (arr[j] < arr[i] && ldsDp[i] < ldsDp[j] + 1) {
                    ldsDp[i] = ldsDp[j] + 1;
                }
            }
        }
    }
}

// top down 방식에선 시간초과가 나온다.
// bottom up 으로 바꿔보자.