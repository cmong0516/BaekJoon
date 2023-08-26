import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if (n == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        for (Integer i : stack) {
            answer += i;
        }

        System.out.println(answer);
    }
}
