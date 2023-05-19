import java.util.Scanner;

public class BaekJoon9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String next = sc.next();
            System.out.println(next.charAt(0) + "" +  next.charAt(next.length()-1));
        }
    }
}
