import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            System.out.println("i = " + i);
            System.out.println("n = " + n);
            if (n % i == 0) {
                n /= i;
                list.add(i);
                i = 1;
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
