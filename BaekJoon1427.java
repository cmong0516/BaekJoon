import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        char[] chars = n.toCharArray();

        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length-1-i]);
        }
    }
}
