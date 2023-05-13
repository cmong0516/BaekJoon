import java.util.Scanner;

public class BaekJoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int i : arr) {
            if (v == i) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
