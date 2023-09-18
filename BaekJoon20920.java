import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.length() >= M) {
                map.put(s, map.getOrDefault(s, 0)+1);
            }

        }

        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (map.get(o1) == map.get(o2)) {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    return o2.length() - o1.length();
                }

                return map.get(o2) - map.get(o1);

            }
        });

        for (String s : keySet) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);



    }
}
