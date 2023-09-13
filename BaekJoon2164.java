import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon2164 {

    static Deque<Integer> deque;
    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        int n = sc.nextInt();

        makeDeque(n);

        while(true){
            int run = run();

            if (run == 1) {
                System.out.println(deque.peek());
                break;
            }
        }
    }

    public static void makeDeque(int n) {
        deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            deque.offer(i + 1);
        }
    }

    public static int run() {
        deque.poll();
        Integer poll = deque.poll();
        deque.offer(poll);

        return deque.size();
    }
}
