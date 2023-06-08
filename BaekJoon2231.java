import java.util.Scanner;

public class BaekJoon2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 198
        // 198 + 1 + 9 + 8 = 216
        // 216 으로 198 을 구해내라.

        String next = sc.next();
        int intNext = Integer.parseInt(next);

        int answer = 0;

        // x + 0~9 + 0~9 + 0~9

        for (int i = intNext - next.length(); i < intNext; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == intNext) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
