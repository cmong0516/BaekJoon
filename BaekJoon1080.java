import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1080 {

    static int[][] A,B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        A = new int[n][m];
        B = new int[n][m];

        for (int i = 0; i < n; i++) {
            String next = sc.next();
            for (int j = 0; j < m; j++) {
                A[i][j] = next.charAt(j)-'0';
            }
        }

        for (int i = 0; i < n; i++) {
            String next = sc.next();
            for (int j = 0; j < m; j++) {
                B[i][j] = next.charAt(j)-'0';
            }
        }

        int cnt = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (A[i][j] != B[i][j]) {
                    change(i,j);
                    cnt++;
                }
            }
        }

        int flag = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == B[i][j]) {
                    flag++;
                }
            }
        }

        if (flag == n * m) {
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }

    }

    public static void change(int x, int y) {
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y + 3; j++) {
                A[i][j] = A[i][j] ^ 1;
            }
        }
    }
}
