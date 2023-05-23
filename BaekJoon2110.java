import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2110 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length - 1];

        // 거리가 늘어난다 = 공유기 갯수가 준다.
        // 거리가 줄어든다 = 공유기 갯수가 는다.

        int low = 1;
        int high = arr[n-1] - arr[0]+1;

        while (low < high) {
            System.out.println("low = " + low);
            System.out.println("high = " + high);

            int mid = (low + high) /2;
            if (install(mid) < c) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }

        System.out.println(low-1);
    }

    public static int install(int distance) {
        int count = 1;
        int lastLocation = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int location = arr[i];

            if (location - lastLocation >= distance) {
                count++;
                lastLocation = location;
            }
        }

        return count;
    }
}
