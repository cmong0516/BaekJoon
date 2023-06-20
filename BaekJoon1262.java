import java.util.Scanner;

public class BaekJoon1262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();

        for (int i = 0,s = R1; i < R2-R1+1; i++,s++) {
            for (int j = 0,t=C1; j < C2-C1+1; j++,t++) {
                int x = s % (2 * N - 1);
                int y = t % (2 * N - 1);
                int dis = Math.abs((N - 1) - x) + Math.abs((N - 1) - y);

                if (dis > N - 1) {
                    System.out.print(".");
                } else {
                    System.out.print(Character.toString((dis % 26) + 'a'));
                }
            }
            System.out.println();
        }


    }
}
