import java.util.Scanner;

public class BaekJoon1189 {

    static int R,C,K;
    static char[][]map;
    static int count;
    static int[]dx = {0,1,0,-1}, dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        K = sc.nextInt();

        sc.nextLine();

        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        BackT(0, new int[]{R - 1, 0});
        System.out.println(count);
    }

    public static void BackT(int depth, int[] now) {
        if (depth == K - 1) {
            if (now[0] == 0 && now[1] == C - 1) {
                count++;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = now[0] + dx[i];
            int ny = now[1] + dy[i];

            if (nx >= 0 && nx < R && ny >= 0 && ny < C && map[nx][ny] != 'T') {
                map[now[0]][now[1]] = 'T';
                BackT(depth+1,new int[]{nx,ny});
                map[now[0]][now[1]] = '.';
            }
        }
    }
}
