import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int pbnc = pbnc(n);

        System.out.println(pbnc);

    }

    public static int pbnc(int n) {
        if (n == 0)return 0;
        if (n == 1) return 1;

        return pbnc(n - 1) + pbnc(n - 2);
    }
}
