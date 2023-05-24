import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2667 {

    static int n;
    static int[][] map;
    static boolean[][]visit = new boolean[25][25];
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1,1,0,0};
    static int cnt,number = 0;
    static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        map = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            map[i] =Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j] && map[i][j] == 1) {
                    cnt= 0;
                    number++;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static void dfs(int x, int y) {

        visit[x][y] = true;
        map[x][y] = number;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visit[nx][ny] && map[nx][ny] == 1) {
                visit[nx][ny] = true;
                map[nx][ny] = number;

                dfs(nx, ny);
            }
        }
    }
}
