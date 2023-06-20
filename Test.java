import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer>[] arr = new ArrayList[3];

        for (List<Integer> list : arr) {
            list = new ArrayList<>();
        }

        for (List<Integer> list : arr) {
            System.out.println("list = " + list);
        }
    }
}
