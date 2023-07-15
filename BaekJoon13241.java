import java.util.Scanner;

public class BaekJoon13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = gcd(Math.max(A, B), Math.min(A, B));

        System.out.println(A*B/gcd);
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
}
