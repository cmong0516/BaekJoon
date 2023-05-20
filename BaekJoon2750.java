import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        Arrays.sort(intArr);

        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
