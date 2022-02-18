
//기존코드
//예제 모두 성공 But 시간초과.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int two = 1;
        int i = 0;
        while (N > 0) {
            while (N > two) {
                two *= 2;
            }
            two = two / 2;
            if (N - two > 0) {
                N = N - two;
            }
            i++;
            System.out.println("two : " + two);
            System.out.println("N : " + N);
            System.out.println("i : " + i);
            if (i >= K || N > two)
                break;
        }
        System.out.println((N - two) * -1);
    }

}