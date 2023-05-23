import java.util.Scanner;

public class BaekJoon2606 {

    static int n,m;
    static int[][] computer;
    static boolean[] visit;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        computer = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            computer[a][b] = computer[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt);

    }

    public static void dfs(int num) {
        visit[num] = true;

        for (int i = 1; i < n+1; i++) {
            if (!visit[i] && computer[num][i] == 1) {
                dfs(i);
                cnt++;
            }
        }
    }

}
