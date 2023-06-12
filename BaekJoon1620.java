import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            map1.put(input, i + 1);
            map2.put(i + 1, input);
        }

        for (int i = 0; i < m; i++) {
            String next = sc.next();

            if (isNum(next)) {
                System.out.println(map2.get(Integer.parseInt(next)));
            } else {
                System.out.println(map1.get(next));
            }

        }
    }

    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
