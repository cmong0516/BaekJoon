import java.util.Scanner;

public class BaekJoon4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testTotal = sc.nextInt();
        for (int i = 0; i < testTotal; i++) {
            int students = sc.nextInt();
            int[] score = new int[students];
            int sum = 0;
            for (int j = 0; j < students; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = (double) sum / (double) students;
            int over = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[j] > avg) {
                    over++;
                }
            }
            System.out.println(String.format("%.3f", ((double) over / (double) students) * 100) + "%");
        }
    }

}
