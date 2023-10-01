import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon14889 {

    static int[][] arr;
    static boolean[] visit;
    static int N;
    static int Min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        makeTeam(0, 0);
        System.out.println(Min);


    }

    public static void makeTeam(int index, int count) {
        if (count == N / 2) {
            calculation();
            return;
        }

        for (int i = index; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                makeTeam(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    public static void calculation() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (visit[i] && visit[j]) {
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                } else if (!visit[i] && !visit[j]) {
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
            }
        }

        int gap = Math.abs(team_start - team_link);

        if (gap == 0) {
            System.out.println(gap);
            System.exit(0);
        }

        Min = Math.min(gap, Min);


    }
}
