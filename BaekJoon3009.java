import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            list1.add(sc.nextInt());
            list2.add(sc.nextInt());
        }

        for (Integer integer : list1) {
            if (Collections.frequency(list1, integer) == 1) {
                sb.append(integer).append(" ");
            }
        }

        for (Integer integer : list2) {
            if (Collections.frequency(list2, integer) == 1) {
                sb.append(integer);
            }
        }

        System.out.println(sb);
    }
}
