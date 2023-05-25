import java.util.Scanner;

public class BaekJoon5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == m && m == 0) {
                break;
            }

            if (n % m == 0) {
                System.out.println("multiple");
            } else if (m % n == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
