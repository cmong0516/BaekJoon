import java.util.Scanner;

public class BaekJoon1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        char[][] achar = new char[n][m];
        char[][] bchar = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            achar[i] = str.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            bchar[i] = str.toCharArray();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (achar[i][j] != bchar[i][j]) {

                }
            }
        }



    }

}
