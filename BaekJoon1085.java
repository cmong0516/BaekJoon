import java.util.Scanner;

public class BaekJoon1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // 한수의 위치 x,y
        // 직사각형 좌표 (0,0) (w,h)

        // 0 으로 가거나 x 는 w y 는 h 로

        System.out.println(Math.min(Math.min(w-x,x),Math.min(h-y,y)));
    }
}
