import java.util.Scanner;

public class BaekJoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int answer = 0;
        int min = n;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                answer+=i;
                min = Math.min(min,i);
            }
        }

        if (answer > 0) {
            System.out.println(answer);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }


    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
