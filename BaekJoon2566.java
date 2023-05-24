import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = -1;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    index1 = i+1;
                    index2 = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.print(index1 + " " + index2);
    }
}
