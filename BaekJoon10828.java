import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10828 {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String input = sc.next();
            if (input.startsWith("push")) {
                stack.push(sc.nextInt());
                continue;
            }

            if (input.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                } else {

                    sb.append(stack.peek()).append("\n");
                    continue;
                }
            }
            if (input.equals("size")) {
                sb.append(stack.size()).append("\n");
                continue;
            }
            if (input.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                    continue;
                } else {
                    sb.append(0).append("\n");
                    continue;
                }
            }
            if (input.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }

            }
        }
        System.out.println(sb);
    }
}
