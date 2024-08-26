package lengthOfLongestSubstring;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String lss = "";
        boolean sub = true;
        int max = 0;

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            lss = "" + s.charAt(i);
            map.put(s.charAt(i), i);
            for (int j = i + 1; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    max = Math.max(max, lss.length());
                    map.clear();
                    lss = "";
                    sub = false;
                    break;
                }
                lss = lss + s.charAt(j);
                max = Math.max(max, lss.length());
                map.put(s.charAt(j), j);
            }
        }
        if (sub) {
            return s.length();
        }
        return max;
    }
}
