import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();



        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int result = search(list, n, m);

        System.out.println(result);
    }

    static int search(List<Integer> list, int n, int m) {

        int max = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int temp = list.get(i) + list.get(j) + list.get(k);

                    if (m == temp) {
                        return temp;
                    }

                    if (max < temp && temp < m) {
                        max = temp;
                    }
                }
            }
        }

        return max;
    }
}
