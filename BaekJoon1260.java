import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1260 {
    public static int[][] branch;
    public static boolean[] visit;
    public static Queue<Integer> queue;
    public static int n;
    public static int m;
    public static int v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        branch = new int[10][10];
        visit = new boolean[1001];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            branch[a][b] = branch[b][a] = 1;
        }

        dfs(v);
        System.out.println();

        Arrays.fill(visit,false);

        bfs(v);

    }

    public static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= n; i++) {
            if (branch[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            Integer temp = queue.poll();

            for (int i = 1; i < branch.length; i++) {
                if (branch[temp][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
