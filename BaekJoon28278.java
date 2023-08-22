import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            int order = Integer.parseInt(command[0]);

            switch (order) {
                case 1:
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    sb.append(!stack.isEmpty() ? stack.peek() + "\n" : "-1\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
