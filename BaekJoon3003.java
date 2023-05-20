import java.util.Scanner;

public class BaekJoon3003 {
    public static void main(String[] args) {
        // 킹 1 개
        // 퀸 1개
        // 룩 2개
        // 비숍 2개
        // 나이트 2개
        // 폰 8개

        int[] arr = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] - sc.nextInt() + " ");
        }
    }
}
