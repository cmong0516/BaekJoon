import java.util.Scanner;

public class BaekJoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3= sc.nextInt();

        if (a1 == a2 && a2 == a3) {
            System.out.println(10000+(1000)*a1);
        } else if (a1 == a2 || a1 == a3) {
            System.out.println(1000+(100)*a1);
        } else if (a2 == a3) {
            System.out.println(1000 + (100) * a2);
        } else {
            System.out.println(Math.max(Math.max(a1,a2),a3)*100);
        }
    }
}
