import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        int sum = list.stream().mapToInt(i -> i).sum();

        Collections.sort(list);

        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}
