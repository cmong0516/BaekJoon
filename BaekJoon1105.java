import java.util.Scanner;

public class BaekJoon1105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String L = sc.next();
        String R = sc.next();
        int cnt = 0;

        if (L.length() == R.length()) {
            for (int i = 0; i < L.length(); i++) {
                if (L.charAt(i) != R.charAt(i)) {
                    break;
                }
                if (L.charAt(i) == '8') {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
