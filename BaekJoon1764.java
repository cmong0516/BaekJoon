import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            map.put(name, map.getOrDefault(name, 0)+1);
        }

        for (int i = 0; i < m; i++) {
            String name = sc.next();
            map.put(name, map.getOrDefault(name, 0)+1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int cnt = 0;
        List<String> result = new ArrayList<>();

        for (String s : list) {
            if (map.get(s) == 2) {
                result.add(s);
                cnt++;
            }
        }

        System.out.println(cnt);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
