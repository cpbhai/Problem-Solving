
import java.util.HashMap;
import java.util.Scanner;

class Solution {
    Scanner sc;

    class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "[" + this.x + ", " + this.y + "]";
        }
    }

    public int lengthOfLongestSubstring(String s) {// https://leetcode.com/problems/longest-substring-without-repeating-characters/
        if (s == "")
            return 0;
        int l = 0, max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) >= l) {
                l = hm.get(s.charAt(i)) + 1;
            }
            hm.put(s.charAt(i), i);
            max = Math.max(i - l + 1, max);
        }
        return max;
    }

    void solve() {
        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}
