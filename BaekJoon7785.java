import java.util.Arrays;
import java.util.HashMap;
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

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
