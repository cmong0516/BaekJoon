import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classNum = sc.nextInt();
        double classAvg = 0;
        double max = 0.0;
        double total = 0.0;
        int[] a = new int[classNum];
        for (int i = 0; i < classNum; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        max = a[(classNum - 1)];
        double[] newClassNum = new double[classNum];
        for (int i = 0; i < classNum; i++) {
            newClassNum[i] = ((double) a[i] / (double) max) * 100;
        }
        for (int i = 0; i < classNum; i++) {
            total += newClassNum[i];
        }
        System.out.println(total / (double) classNum);
    }
}