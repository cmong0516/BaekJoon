import java.util.Scanner;

public class BaekJoon2485 {

    static int[] gaps;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] trees = new int[n];

        gaps = new int[n - 1];

        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();

            if (i > 0) {
                gaps[i - 1] = trees[i] - trees[i - 1];
            }
        }

        for (int i = 0; i <= gaps.length - 2; i++) {
            gaps[i + 1] = gcd(gaps[i], gaps[i + 1]);
        }

        int gap = gaps[gaps.length-1];
        System.out.println((trees[n - 1] - trees[0]) / gap - (n - 1));
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}
