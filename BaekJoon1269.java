import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < a; i++) {
            set1.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            set2.add(sc.nextInt());
        }

        int cnt = 0;

        for (Integer integer : set1) {
            if (!set2.contains(integer)) {
                cnt++;
            }
        }

        for (Integer integer : set2) {
            if (!set1.contains(integer)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
