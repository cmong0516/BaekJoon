import java.util.Scanner;

public class BaekJoon1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int six = 666;
        int cnt = 1;

        while (cnt != n) {
            six++;

            if (String.valueOf(six).contains("666")) {
                cnt++;
            }
        }

        System.out.println(six);
    }
}
