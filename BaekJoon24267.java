import java.util.Scanner;

public class BaekJoon24267 {

    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println(3);
    }

    public static void method(long n) {
        for (int i = 1; i <= n-2; i++) {
            for (int j = i+1; j <= n ; j++) {
                for (int k = j+1; k <= n; k++) {
                    cnt++;
                }
            }
        }

        // 0  0  1  4 10
    }
}
