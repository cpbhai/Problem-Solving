import java.util.Arrays;
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

    void solve() {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 1, 0 };
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] == 0)
                A[k++] = 0;
        }
        for (int i = k; i < n; ++i) {
            A[k++] = 1;
        }
        System.out.println(Arrays.toString(A));
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class SortBinaryArray {// javac Main.java && java Main
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}