import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1874 {
    public static Scanner sc = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();

        int start = 0;

        while (N-- > 0) {
            int value = sc.nextInt();

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
