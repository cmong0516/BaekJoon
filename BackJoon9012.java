import java.util.Scanner;
import java.util.Stack;

public class BackJoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(solution(sc.next()));
        }
    }

    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
