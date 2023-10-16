import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[][] sum = new int[S.length()][26];

        sum[0][S.charAt(0)-'a']++;

        for (int i = 1; i < S.length(); i++) {
            int temp = S.charAt(i) - 'a';

            for (int j = 0; j < 26; j++) {
                sum[i][j] = sum[i - 1][j];
            }
            sum[i][temp]++;
        }

        int q = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char find =  st.nextToken().charAt(0);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == 0) {
                sb.append(sum[end][find - 'a']).append("\n");
            } else {
                sb.append(sum[end][find - 'a'] - sum[start - 1][find - 'a']).append("\n");
            }
        }

        System.out.println(sb);

    }
}

// 시간초과

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String S = br.readLine();
//    int q = Integer.parseInt(br.readLine());
//        for (int i = 0; i < q; i++) {
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String a = st.nextToken();
//        int l = Integer.parseInt(st.nextToken());
//        int r = Integer.parseInt(st.nextToken());
//
//        List<String> split = List.of(S.substring(l, r+1).split(""));
//
//        System.out.println(Collections.frequency(split,a));
//        }

// 누적합으로 풀자.