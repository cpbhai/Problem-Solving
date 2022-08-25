import java.util.Scanner;

public class Main {// javac Main.java && timeout 2s java Main<inp.txt>out.txt
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " was entered");
        sc.close();
    }
}