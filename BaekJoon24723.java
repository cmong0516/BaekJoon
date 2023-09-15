import java.util.Scanner;

public class BaekJoon24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int answer = 1;

        // 2 2*2 2*2*2

        for (int i = 0; i < N; i++) {
            answer *= 2;
        }

        System.out.println(answer);
    }
}
