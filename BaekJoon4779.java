import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4779 {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;



        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            sb = new StringBuilder();

            int pow = (int) Math.pow(3, n);

            for (int i = 0; i < pow; i++) {
                sb.append("-");
            }

            replace(0,pow);

            System.out.println(sb);
        }
    }

    public static void replace(int start, int size) {
        if (size == 1) {
            return;
        }
        int newSize = size/3;

        for (int i = start+newSize; i < start+2*newSize; i++) {
            sb.setCharAt(i,' ');
        }

        replace(start,newSize);
        replace(start + 2 * newSize, newSize);
    }
}
