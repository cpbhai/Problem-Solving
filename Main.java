import java.util.Scanner;

class Solution {
    Scanner sc;

    Integer solve() {
        int x = sc.nextInt();
        return x;
    }

    void harsh() {
        sc = new Scanner(System.in);
        System.out.println(solve());
        sc.close();
    }
}

public class Main {// javac Main.java && timeout 2s java Main<inp.txt>out.txt
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}