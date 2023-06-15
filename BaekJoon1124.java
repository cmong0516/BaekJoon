import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isUnderPrime(i)) {

                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isUnderPrime(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                list.add(i);
                i = 1;
            }
        }


        return isPrime(list.size());

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
