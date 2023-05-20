import java.util.Scanner;

public class BaekJoon10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String next = sc.next();

        int answer = 1;

        for (int i = 0; i < next.length()/2; i++) {
            if (next.charAt(i) != next.charAt(next.length() - 1 - i)) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
    }
}
