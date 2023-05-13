import java.util.Scanner;

public class BaekJoon25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        while (n > 4) {
            sb.append("long ");
            n-=4;
        }

        sb.append("long int");

        System.out.println(sb);
    }
}
