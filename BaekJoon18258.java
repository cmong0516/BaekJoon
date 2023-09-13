import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon18258 {

    static Deque<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer order;

        while (n-- > 0) {
            order = new StringTokenizer(br.readLine(), " ");

            switch (order.nextToken()) {
                case "push":
                    push(Integer.parseInt(order.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;

            }
        }

        System.out.println(sb);
    }

    public static void push(int number) {
        queue.offer(number);
    }

    public static void pop() {
        if (queue.isEmpty()) {
            sb.append(-1).append('\n');
        } else {
            Integer poll = queue.poll();
            sb.append(poll).append('\n');
        }
    }

    public static void size() {
        sb.append(queue.size()).append('\n');
    }

    public static void empty() {
        if (queue.isEmpty()) {
            sb.append(1).append('\n');
        } else {
            sb.append(0).append('\n');
        }
    }

    public static void front() {
        if (queue.isEmpty()) {
            sb.append(-1).append('\n');
        } else {
            sb.append(queue.peek()).append('\n');
        }
    }

    public static void back() {
        if (queue.isEmpty()) {
            sb.append(-1).append('\n');
        } else {
            sb.append(queue.peekLast()).append('\n');
        }


    }
}