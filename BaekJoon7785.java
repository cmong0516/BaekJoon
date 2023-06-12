import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String state = sc.next();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, state);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort(Collections.reverseOrder());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
