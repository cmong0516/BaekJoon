import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon10815 {

    static int n,m;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());

        int[] answer = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            System.out.print(binarySearch(Integer.parseInt(st.nextToken())) + " ");
        }

    }

    private static int binarySearch(int num) {
        int left = 0;
        int right = n-1;

        while (left <= right) {
            int midIndex = (left + right) / 2;
            int mid = arr[midIndex];

            if (num < mid) {
                right = midIndex-1;
            } else if (num > mid) {
                left = midIndex + 1;
            } else {
                return 1;
            }
        }

        return 0;
    }
}
