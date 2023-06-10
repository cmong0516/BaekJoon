import java.util.Scanner;

public class BaekJoon2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            // 124 - (124/25) * 25
            //          4

            System.out.print(c/25 + " ");

            c -= (c/25) * 25;

            System.out.print(c/10 + " ");

            c -= (c/10) * 10;

            System.out.print(c/5 + " ");

            c -= (c/5) * 5;

            System.out.print(c + " " + "\n");

        }
    }
}
