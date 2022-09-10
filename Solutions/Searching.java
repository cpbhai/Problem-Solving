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

    int binarySearch(int[] arr, int key) {
        int i = 0, n = arr.length, j = n - 1;
        while (i <= j) {
            int mid = i + ((j - i) / 2);
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return -1;
    }

    void solve() {
        int arr[] = { 3, 4, 5, 6, 7, 18, 29 };
        System.out.println(binarySearch(arr, 7));
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class Searching {// javac Main.java && java Main
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}