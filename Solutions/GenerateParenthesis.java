import java.util.ArrayList;
import java.util.List;
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

    void generate(String s, int op, int cl, int n, List<String> ans) {
        if (op == cl && op + cl == 2 * n) {
            ans.add(s);
            return;
        }
        if (op >= cl && op < n) {
            generate(s + "(", op + 1, cl, n, ans);
        }
        if (op >= cl && cl < n) {
            generate(s + ")", op, cl + 1, n, ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int op = 0, cl = 0;
        String s = "";
        generate(s, op, cl, n, ans);
        return ans;
    }

    void solve() {
        int n = sc.nextInt();
        System.out.println(generateParenthesis(n));
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class GenerateParenthesis {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}
