import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon10866 {

    public static Deque<Integer> deque = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solution(sc.next());
        }

        System.out.println(sb);
    }

    public static void solution(String s) {
        if (s.startsWith("push_back")) {
            deque.addLast(sc.nextInt());
            return;
        }

        if (s.startsWith("push_front")) {
            deque.addFirst(sc.nextInt());
            return;
        }

        if (s.equals("pop_front")) {
            if (deque.isEmpty()) {
                sb.append("-1").append("\n");
                return;
            } else {
                sb.append(deque.pollFirst()).append("\n");
                return;
            }
        }

        if (s.equals("pop_back")) {
            if (deque.isEmpty()) {
                sb.append("-1").append("\n");
                return;
            } else {
                sb.append(deque.pollLast()).append("\n");
                return;
            }
        }

        if (s.equals("size")) {
            sb.append(deque.size()).append("\n");
            return;
        }

        if (s.equals("empty")) {
            if (deque.isEmpty()) {
                sb.append("1").append("\n");
                return;
            } else {
                sb.append("0").append("\n");
                return;
            }
        }

        if (s.equals("front")) {
            if (deque.isEmpty()) {
                sb.append("-1").append("\n");
                return;
            } else {
                sb.append(deque.peekFirst()).append("\n");
                return;
            }
        }

        if (s.equals("back")) {
            if (deque.isEmpty()) {
                sb.append("-1").append("\n");
            } else {
                sb.append(deque.peekLast()).append("\n");
            }
        }
    }
}
