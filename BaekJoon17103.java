import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon17103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(countGBP(n));
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countGBP(int number) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < number; i++) {
            if (isPrime(i) && isPrime(number - i) && !map.containsKey(i) && !map.containsValue(i)) {
                map.put(i, number - i);
            }
        }
        return map.size();
    }
}
