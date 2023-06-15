import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon1141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        });

        System.out.println("list = " + list);

        Set<String> set = new HashSet<>();

        for (String s : list) {
            if (set.size() == 0) {
                set.add(s);
                continue;
            }

            boolean can = true;

            for (String s1 : set) {
                if (s1.startsWith(s)) {
                    can = false;
                    break;
                }
            }

            if (can) {
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}
