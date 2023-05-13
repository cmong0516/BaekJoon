import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            hash.add(sc.nextInt() % 42);
        }
        System.out.println(hash.size());
    }

}
