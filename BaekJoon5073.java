import java.util.Scanner;

public class BaekJoon5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();

            int b = sc.nextInt();

            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(Math.max(a,b),c);

            String result = "";

            if(a == max) {
                if(a >= b+c)
                    result = "Invalid";
            }
            else if(b == max) {
                if(b >= a+c)
                    result = "Invalid";
            }
            else {
                if(c >= a+b)
                    result = "Invalid";
            }

            // 3)
            if(result == "" && a == b && b == c )
                result = "Equilateral";
            else if(result == "" && (a == b && b != c) || (a == c && b != c) || (b == c && a != b))
                result = "Isosceles";
            else if(result == "" && a != b && b != c && a != c)
                result = "Scalene";

            System.out.println(result);
        }
    }
}
