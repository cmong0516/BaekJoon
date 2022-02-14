import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, j;
        for (i = 1, j = 0; i <= a; i++) {
            j += i;
        }
        System.out.println(j);
    }
}