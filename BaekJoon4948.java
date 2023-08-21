import java.util.Scanner;

public class BaekJoon4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            System.out.println(dukeBertrand(n));
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

    public static int dukeBertrand(int number) {
        int count = 0;

        for (int i = number+1; i <= number *2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }
}
