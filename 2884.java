import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b < 45 && a == 0) {
            a = 23;
            System.out.printf("%d %d", a, (60 - (45 - b)));
        } else if (b < 45 && a >= 1) {
            System.out.printf("%d %d", (a - 1), (60 - (45 - b)));
        } else {
            System.out.printf("%d %d", a, b - 45);
        }
    }
}