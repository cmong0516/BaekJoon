import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2512 {

    static int[] arr;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();

        int left = 0;
        int right = arr[n-1];


        while (left <= right) {
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            int mid = (left + right) / 2;
            long sum = 0;

            for (int i : arr) {
                if (i >= mid) {
                    sum += mid;
                } else {
                    sum +=i;
                }
            }
            if (sum > m) {
                right = mid - 1;
            } else {
                left=  mid+1;
                System.out.println("sum = " + sum);
                System.out.println("mid = " + mid);
                answer = Math.max(answer,mid);
            }
        }

        System.out.println(answer);


    }
}
