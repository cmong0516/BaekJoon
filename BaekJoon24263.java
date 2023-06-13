import java.util.Scanner;

public class BaekJoon24263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);
        System.out.println(1);

    }

    public static int menOfPassion(int[] arr, int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
