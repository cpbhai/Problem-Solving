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

    public String convert(String s, int numRows) {
        // https://leetcode.com/problems/zigzag-conversion/
        // https://www.youtube.com/watch?v=pEku6cp_J80
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            sbs[i] = new StringBuilder();
        }

        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            // Go Down
            for (int j = 0; j < numRows && i < n; ++j) {
                sbs[j].append(arr[i++]);
            }
            // Go Up
            for (int j = numRows - 2; j > 0 && i < n; --j) {
                sbs[j].append(arr[i++]);
            }
        }
        StringBuilder res = sbs[0];
        for (i = 1; i < numRows; ++i) {
            res.append(sbs[i].toString());
        }
        return res.toString();
    }

    void solve() {
        String s;
        int n;
        s = sc.next();
        n = sc.nextInt();
        System.out.println(s + " " + n);
        System.out.println(convert(s, n));
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class ZigzagConversion {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}
