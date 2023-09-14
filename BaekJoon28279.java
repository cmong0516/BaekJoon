import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon28279 {

    static Deque<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            switch (order){
                case 1:
                    deque.addFirst(Integer.valueOf(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.valueOf(st.nextToken()));
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        System.out.println(-1);

                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                case 5:
                    System.out.println(deque.size());
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 7:
                    if (!deque.isEmpty()) {
                        System.out.println(deque.peekFirst());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 8:
                    if (!deque.isEmpty()) {
                        System.out.println(deque.peekLast());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
