import java.util.Scanner;
import java.util.Stack;

public class BaekJoon28278 {

    static Scanner sc = new Scanner(System.in);
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int order = sc.nextInt();
            if (order == 1) {

                method1(sc.nextInt());
            }
            if (order == 2) {
                method2();
            }
            if (order == 3) {
                method3();
            }
            if (order == 4) {
                method4();
            }
            if (order == 5) {
                method5();
            }
        }

    }

    public static void method1(int x) {
        stack.push(x);
    }
    public static void method2() {
        if (!stack.isEmpty()) {
            Integer pop = stack.pop();
            System.out.println(pop);
        } else {
            System.out.println(-1);
        }
    }
    public static void method3() {
        System.out.println(stack.size());
    }
    public static void method4() {
        if (stack.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    public static void method5() {
        if (!stack.isEmpty()) {
            System.out.println(stack.peek());
        } else {
            System.out.println(-1);
        }
    }
}
