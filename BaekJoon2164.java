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

        while(deque.size() > 1){
            deque.poll();
            Integer poll = deque.poll();
            deque.offer(poll);
        }

        System.out.println(deque.poll());

    }

    public static void makeDeque(int n) {
        deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            deque.offer(i + 1);
        }
    }
}
