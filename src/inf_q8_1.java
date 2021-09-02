import java.util.HashMap;
import java.util.Map;

public class inf_q8_1 {
    /*
    Map + getOrDefault();

    주어진 문자열에서 반복되지 않는 첫 번째 문자를 찾아서 index를 return 합니다.
    존재하지 않으면 -1을 반환합니다.
     */
    public static int solve(String s) {
        if (s == null || s.length() == 0) return -1;

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
