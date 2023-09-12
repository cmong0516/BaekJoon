import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon12789 {

    static Queue<Integer> queue;
    static Stack<Integer> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    static int index = 1;

    public static void main(String[] args) {

        makeQueue();

        while (!queue.isEmpty()) {
            Integer queuePeek = queue.peek();

            if (queuePeek == index) {
                queue.poll();
                index++;
            } else if (!stack.isEmpty() && stack.peek() == index) {
                stack.pop();
                index++;
            } else {
                stack.push(queue.poll());
            }

        }

        while (!stack.isEmpty()) {
            Integer stackPeek = stack.peek();
            if (stackPeek == index) {
                stack.pop();
                index++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");

    }

    public static void makeQueue() {
        queue= new LinkedList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
    }
}
