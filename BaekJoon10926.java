import java.util.Scanner;

class BaekJoon10926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if (id.length() <= 50) {
            id = id.toLowerCase() + "??!";
        }
        System.out.println(id);
    }
}