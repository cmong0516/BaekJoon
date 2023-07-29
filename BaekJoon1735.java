import java.util.Scanner;

public class BaekJoon1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        a = a*d + c * b;
        b = b * d;
        int gcd = gcd(a, b);

        System.out.println(a / gcd + " " + b / gcd);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}