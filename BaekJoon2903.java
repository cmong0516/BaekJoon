import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 9 25 a a 1089
        // 3 (3+(3-1))     33

        // a+(a-1)

        int n = sc.nextInt();

        int[] arr = new int[15];

        int i = 2;
        int cnt = 0;
        while (true) {
            arr[cnt] = (i+(i-1)) * (i+(i-1));
            i = i+(i-1);
            cnt++;

            if (cnt > 14) {
                break;
            }
        }

        System.out.println(arr[n-1]);

    }
}
