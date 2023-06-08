import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr,(s1,s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        String temp = "";

        for (String s : arr) {
            if (!temp.equals(s)) {
                System.out.println(s);
            }
            temp = s;
        }
    }
}
