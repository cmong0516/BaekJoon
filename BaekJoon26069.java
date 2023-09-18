import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> dancing = new HashSet<>();

        dancing.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");
            if (dancing.contains(split[0]) || dancing.contains(split[1])) {
                dancing.add(split[0]);
                dancing.add(split[1]);
            }
        }

        System.out.println(dancing.size());

    }
}
