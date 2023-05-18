import java.util.Scanner;

public class BaekJoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[30];

        for (int i = 0; i < 30; i++) {
            arr[sc.nextInt()-1] = true;
        }

        for (boolean b : arr) {
            if (!b) {
                System.out.println(b);
            }
        }
    }
}
