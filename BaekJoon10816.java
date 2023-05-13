import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();

            sb.append(map.getOrDefault(k, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
