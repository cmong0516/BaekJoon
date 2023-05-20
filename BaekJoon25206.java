import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon25206 {
    public static void main(String[] args) {
        // 전공평점 = (학점 * 과목평점) / 학점

        Scanner sc = new Scanner(System.in);

        String gradeArr[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScoreArr[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        String[] strArr = new String[20];

        double totalSum = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            strArr[i] = sc.nextLine();
            StringTokenizer st = new StringTokenizer(strArr[i], " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeArr[j])) {
                    totalSum += score * gradeScoreArr[j];
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        double avg = totalSum / scoreSum;
        System.out.printf("%.6f\n", avg);


    }
}
