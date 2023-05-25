import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }


            if (list.stream().mapToInt(Integer::intValue).sum() != n) {
                System.out.println(n + " is NOT perfect.");
            } else {
                sb.append(n).append(" = ").append(list.get(0));

                for (int i = 1; i < list.size(); i++) {
                    sb.append(" + ").append(list.get(i));
                }

                System.out.println(sb);
            }


        }
    }
}
