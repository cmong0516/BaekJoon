import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1158 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 0; i < N; i++) {
            queue.offer(i + 1);
        }

        while (!queue.isEmpty()) {
            System.out.println("queue = " + queue);
            System.out.println("cnt = " + cnt);
            if (cnt == K-1) {
                sb.append(queue.poll()).append(", ");
                cnt = 0;
            } else {
                Integer poll = queue.poll();
                queue.offer(poll);
                cnt++;
            }
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        System.out.println(sb);
    }
}
