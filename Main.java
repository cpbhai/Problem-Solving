import java.util.Scanner;

class Solution {
    String solve() {
        return "Harsh";
    }
    void harsh() {
        System.out.println(solve());
    }
}

public class Main {// javac Main.java && timeout 2s java Main<inp.txt>out.txt
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        sol.harsh();
        sc.close();
    }
}