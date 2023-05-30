import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        if (list.get(0) + list.get(1) > list.get(2)) {
            System.out.println(a + b + c);
        } else {
            System.out.println((list.get(0) + list.get(1))*2-1);
        }
    }
}
