import java.util.Scanner;

public class BaekJoon10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        int answer = 1;

        for (int i = 2; i <= n; i++) {
            answer *= i;
        }

        if (n <= 1) {
            answer = 1;
        }

        System.out.println(answer);
    }
}
