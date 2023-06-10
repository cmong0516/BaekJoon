import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<String> nList = new ArrayList<>();
        List<String> mList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nList.add(sc.next());
        }

        for (int i = 0; i < m; i++) {
            mList.add(sc.next());
        }

        int cnt = 0;

        for (String s : mList) {
            if (nList.contains(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
