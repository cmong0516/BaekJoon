import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 2 3 4 5 6 7
        // 1 2 4 5 6 7       3
        // 1 2 4 5 7         6

        int n = sc.nextInt();
        int k = sc.nextInt();
        int index = 1;

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while (temp.size() != n) {
            Integer poll = queue.poll();
            if (index == k && !temp.contains(poll)) {
                temp.offer(poll);
                index = 1;
            } else {
                queue.offer(poll);
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");

        for (Integer i : temp) {
            sb.append(i).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());

        sb.append(">");

        System.out.println(sb);
    }
}
