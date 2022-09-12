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

    public String longestPalindrome(String s) {
        // https://leetcode.com/problems/longest-palindromic-substring/
        // https://www.youtube.com/watch?v=WpYHNHofwjc&t=327s
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        String ans = "";
        for (int i = 0; i < n; ++i) {
            for (int j = 0, k = i; k < n; ++j, ++k) {
                if (i == 0) {
                    dp[j][k] = true;
                    ans = s.substring(j, k + 1);
                } else if (i == 1) {
                    if (s.charAt(j) == s.charAt(k)) {
                        dp[j][k] = true;
                        ans = s.substring(j, k + 1);
                    } else
                        dp[j][k] = false;
                } else {
                    if (s.charAt(j) == s.charAt(k) && dp[j + 1][k - 1]) {
                        dp[j][k] = true;
                        ans = s.substring(j, k + 1);
                    } else
                        dp[j][k] = false;
                }
            }
        }
        return ans;
    }

    void solve() {
        String s = sc.next();
        System.out.println(longestPalindrome(s));
    }

    void harsh() {
        sc = new Scanner(System.in);
        int x = 2;
        while (x-- > 0)
            solve();
        sc.close();
    }
}

public class LongestPalindrome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}
