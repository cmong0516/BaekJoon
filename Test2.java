import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int[][] relationships = {{1, 2}, {2, 3}, {2, 6}, {3, 4}, {4, 5}};

        solution(relationships,2,3);
    }
    public static int solution(int[][] relationships, int target, int limit) {
        Map<Integer, Set<Integer>> friendsMap = new HashMap<>();

        // 친구 관계 맵 생성
        for (int[] relationship : relationships) {
            int friend1 = relationship[0];
            int friend2 = relationship[1];
            friendsMap.putIfAbsent(friend1, new TreeSet<>());
            friendsMap.putIfAbsent(friend2, new TreeSet<>());
            friendsMap.get(friend1).add(friend2);
            friendsMap.get(friend2).add(friend1);
        }

        // 새로운 친구 추가
        while (limit > 0) {
            int newFriend = getNewFriend(friendsMap);
            if (newFriend == -1) {
                break;
            }
            limit--;

            for (int key : friendsMap.keySet()) {
                if (friendsMap.get(key).contains(newFriend)) {
                    friendsMap.get(key).add(newFriend);
                    friendsMap.get(newFriend).add(key);
                }
            }
            friendsMap.put(newFriend, new TreeSet<>());
        }

        // 타겟의 친구 수 계산
        if (friendsMap.containsKey(target)) {
            return friendsMap.get(target).size();
        }

        return 0;
    }

    static int getNewFriend(Map<Integer, Set<Integer>> friendsMap) {
        for (int key : friendsMap.keySet()) {
            if (friendsMap.get(key).isEmpty()) {
                return key;
            }
        }
        return -1;
    }
}
