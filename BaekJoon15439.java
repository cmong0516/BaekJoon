import java.util.Scanner;

public class BaekJoon15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 2) {
            System.out.println(2);
        } else {
            System.out.println(N * (N-1));
        }


    }
}
