import java.util.Scanner;

public class BaekJoon9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minx = sc.nextInt();
        int miny = sc.nextInt();

        int maxx = minx;
        int maxy = miny;

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (minx > a) {
                minx = a;
            }

            if (miny > b) {
                miny = b;
            }

            if (maxx < a) {
                maxx = a;
            }

            if (maxy < b) {
                maxy = b;
            }
        }

        System.out.print((maxx - minx) * (maxy - miny));
    }
}
