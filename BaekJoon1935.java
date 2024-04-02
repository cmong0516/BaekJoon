import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String data = sc.next();
        double[] arr = new double[t];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        Stack<Double> stack = new Stack<>();

        double result = 0;

        for (int i = 0; i < data.length(); i++) {
            if ('A' <= data.charAt(i) && data.charAt(i) <= 'Z') {
                stack.push(arr[data.charAt(i) - 'A']);
            } else {
                if (!stack.isEmpty()) {
                    double first = stack.pop();
                    double second = stack.pop();
                    switch (data.charAt(i)) {
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;
                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;
                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;
                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }
        System.out.printf("%.2f", stack.pop());

    }
}
