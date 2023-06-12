import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list1.add(sc.next());
        }

        for (int i = 0; i < m; i++) {
            list2.add(sc.next());
        }

        if (n > m) {
            for (String s : list1) {
                if (list2.contains(s)) {
                    System.out.println(s);
                }
            }
        } else {
            for (String s : list2) {
                if (list1.contains(s)) {
                    System.out.println(s);
                }
            }
        }
    }
}
