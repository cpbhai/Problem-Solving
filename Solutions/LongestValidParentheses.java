import java.util.Scanner;
import java.util.Stack;

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

    public int longestValidParentheses(String s) {
        // https://leetcode.com/problems/longest-valid-parentheses/submissions/
        // https://www.youtube.com/watch?v=VdQuwtEd10M
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        st.add(-1);
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                st.add(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.add(i);
                } else {
                    int len = i - st.peek();
                    ans = Math.max(ans, len);
                }
            }
        }
        return ans;
    }

    void solve() {
        String s = sc.next();
        System.out.println(longestValidParentheses(s));
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class LongestValidParentheses {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}
