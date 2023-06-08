import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        int[] arr = new int[n];

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int nextInt = sc.nextInt();
            set.add(nextInt);
            arr[i] = nextInt;
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i),index);
            index++;
        }

        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
