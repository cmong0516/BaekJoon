import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon18258 {

    static Deque<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            String order = sc.nextLine();
            String[] split = order.split(" ");


            switch (split[0]) {
                case "push":
                    push(Integer.parseInt(split[1]));
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
                default:
                    break;
            }
        }
    }

    public static void push(int number) {
        queue.offer(number);
    }

    public static void pop() {
        if (queue.isEmpty()) {
            System.out.println("-1");
        } else {
            Integer poll = queue.poll();
            System.out.println(poll);
        }
    }

    public static void size() {
        System.out.println(queue.size());
    }

    public static void empty() {
        if (queue.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void front() {
        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.peek());
        }
    }

    public static void back() {
        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.peekLast());
        }


    }
}