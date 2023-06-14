import java.util.Scanner;

public class BaekJoon1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = gcd(a, b);

            System.out.println(a*b/c);

        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a= b;
            b= r;
        }

        return a;
    }
}
