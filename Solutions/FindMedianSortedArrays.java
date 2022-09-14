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

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //https://leetcode.com/problems/median-of-two-sorted-arrays/
        //https://www.youtube.com/watch?v=xZed_DXZNoU
        int n1 = nums1.length, n2 = nums2.length, n3 = n1 + n2;
        int[] merged = new int[n3];
        int i = 0, j = 0, k = 0;
        for (; i < n3 && j < n3; ++k) {
            if (i == n1) {
                if (j < n2) {
                    while (j < n2) {
                        merged[k] = nums2[j];
                        ++k;
                        ++j;
                    }
                } else
                    break;
            } else if (j == n2) {
                if (i < n1) {
                    while (i < n1) {
                        merged[k] = nums1[i];
                        ++k;
                        ++i;
                    }
                } else
                    break;
            } else {
                if (nums1[i] <= nums2[j]) {
                    merged[k] = nums1[i];
                    i++;
                } else {
                    merged[k] = nums2[j];
                    j++;
                }
            }
        }
        // System.out.println(i + " " + j + " " + k);
        // System.out.println(Arrays.toString(merged));
        if (n3 % 2 == 0) {
            return (double) (merged[n3 / 2 - 1] + merged[n3 / 2]) / 2;
        }
        return merged[n3 / 2];
    }

    void solve() {
        int[] nums1 = {}, nums2 = { 2, 4, 8, };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}
