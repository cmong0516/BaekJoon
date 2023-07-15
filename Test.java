import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        solution("1451232125", 2);
    }

    public static int solution(String s, int N) {
        int answer = 0;

        // 길이가 N 인 s 의 substring 을 10진수로 읽은수
        // 1부터 N 까지의 숫자를 하나씩 사용하여 만든 N자리 숫자

        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length()-N+1; i++) {
            String substring = s.substring(i, i + N);

            int index = 1;

            while (index < N+1) {
                if (substring.contains(String.valueOf(index))) {
                    index++;

                    if (index == N + 1) {
                        set.add(substring);
                    }
                } else {
                    index = 1;
                    break;
                }


            }

            System.out.println("set = " + set);
        }

        for (String s1 : set) {
            answer = Math.max(answer, Integer.parseInt(s1));
        }

        if (set.size() == 0) {
            answer = -1;
        }

        return answer;
    }
}
