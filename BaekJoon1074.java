import java.util.Scanner;

public class BaekJoon1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;

        System.out.println(z(n, c,r,result));
    }

    public static int z(int n, int x, int y,int result) {

        if (n == 0) {
            return result;
        }

        int half = (int)Math.pow(2,n-1);
        int zone;

        if (x >= half && y >= half) {
            zone = 3;
            x -= half;
            y -= half;
        } else if (x < half && y >= half) {
            zone = 2;
            y -= half;
        } else if (x >= half && y < half) {
            zone = 1;
            x -= half;
        } else {
            zone = 0;
        }

        int initNum = (int) Math.pow(4, n - 1);
        result += initNum * zone;

        return z(--n, x, y, result);
    }
}
