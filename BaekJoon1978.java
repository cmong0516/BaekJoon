import java.util.Scanner;

public class BaekJoon1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(sc.nextInt())) {
                answer++;
            }
        }

        System.out.println(answer);


    }

    public static boolean isPrime(int n) {

        if (n == 1) {
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
