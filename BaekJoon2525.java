import java.util.Scanner;

public class BaekJoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int m = sc.nextInt();
        int takeTime = sc.nextInt();

        if (takeTime >= 60) {
            t += takeTime/60;
            takeTime %= 60;
        }

        m += takeTime;

        if (m >= 60) {
            t++;
            m -= 60;
        }

        if (t >= 24) {
            t -= 24;
        }

        System.out.println(t + " " + m);
    }
}
