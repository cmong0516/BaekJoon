import java.util.Scanner;

public class BaekJoon1193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 1/1 1/2 2/1 1/3 2/2 3/1 1/4 2/3 3/2 4/1 1/5 2/4 3/3 4/2 5/1
        //  2   3   3   4   4   4   5  5   5    5   6  6     6  6   6

        int crossLength = 1;
        int beforeCrossSum = 0;

        while (true) {
            if (x <= beforeCrossSum + crossLength) {
                if (crossLength % 2 == 0) {
                    System.out.print((x - beforeCrossSum) + "/" + (crossLength - (x - beforeCrossSum - 1)));
                    break;
                } else {
                    System.out.print((x - beforeCrossSum) + "/" + (crossLength - (x - beforeCrossSum - 1)));
                    break;
                }
            } else {
                beforeCrossSum += crossLength;
                crossLength++;
            }
        }
    }
}
