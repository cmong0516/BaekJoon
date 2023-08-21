import java.util.Scanner;

public class BaekJoon4134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long nextPrime = findNextPrime(n);
            System.out.println(nextPrime);
        }
    }

    public static Long findNextPrime(Long number) {
        while (true) {
            number++;
            if (isPrime(number)) {
                return number;
            }
        }
    }

    public static boolean isPrime(Long number) {
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


}
