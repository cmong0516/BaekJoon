import java.util.Scanner;

public class BaekJoon24265 {

    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        method(n);

        System.out.println((n*(n-1))/2);
        System.out.println(2);
    }

    public static void method(long n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                cnt++;
            }
        }

    }
}
