import java.util.Scanner;

public class BaekJoon25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int totalType = sc.nextInt();

        int temp = 0;

        for (int i = 0; i < totalType; i++) {
            int productPrice = sc.nextInt();
            int productQuantity = sc.nextInt();

            temp += productPrice * productQuantity;
        }

        if (totalPrice == temp) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
