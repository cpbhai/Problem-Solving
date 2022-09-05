import java.util.ArrayList;
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

    void putInMap(HashMap<Integer, ArrayList<Integer>> hm, int key, int value) {
        hm.putIfAbsent(key, new ArrayList<>());
        hm.get(key).add(value);
    }

    void printAllSubs(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        putInMap(hm, 0, -1);
        int n = arr.length, sm = 0;
        for (int i = 0; i < n; ++i) {
            sm += arr[i];
            if (hm.containsKey(sm)) {
                ArrayList<Integer> tmp = hm.get(sm);
                for (int e : tmp) {
                    System.out.println("[" + (e + 1) + "..." + i + "]");
                }
            }
            putInMap(hm, sm, i);
        }
    }

    void solve() {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printAllSubs(nums);
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class Main {// javac Main.java && java Main
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}