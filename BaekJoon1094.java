import java.util.ArrayList;
import java.util.List;

public class BaekJoon1094 {

    static List<Integer> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add(64);
    }

    public static int cut(int x) {

        // 가지고 있는 막대중 가장 짧은것
        sortList();
        Integer theSmallestStick = list.get(0);
        // 반으로 자른다.
        int halfSmallesStick = theSmallestStick / 2;
        // 반으로 잘린 막대는 이제 없음
        list.remove(theSmallestStick);
        // 가장 작은 막대를 반으로 잘라서 생긴 두개의 막대
        list.add(halfSmallesStick);
        list.add(halfSmallesStick);

        // 위에서 자른 막대의 절반중 하나를 버리고 남아있는 막대의 길이의 합이
        list.remove(halfSmallesStick);

        int total = list.stream().mapToInt(Integer::intValue).sum();
        // x 보다 크거나 같으면
        if (total >= x) {

        }


        return 1;
    }

    public static void sortList() {
        list.sort((o1, o2) -> o1-o2);
    }
}
