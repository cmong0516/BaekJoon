import java.util.Scanner;

public class BaekJoon13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    arr[i-1] = !arr[i-1];
                }
            }
        }

        int count = 0;

        for (boolean b : arr) {
            if (b == true) {
                count++;
            }
        }

        System.out.println(count);
    }
}

// 메모리 초과
// 21억 크기의 배열을 만들어야한다...