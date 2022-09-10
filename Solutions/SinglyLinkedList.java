import java.util.Scanner;

class LinkedList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    void push(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteKey(int key) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.val == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    void deleteByIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            if (count + 1 == index) {
                temp.next = temp.next.next;
                break;
            }
            ++count;
            temp = temp.next;
        }
    }

    void drop() {
        head = null;
    }

    int length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
}

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
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.traverse();
        System.out.println(list.length());
    }

    void harsh() {
        sc = new Scanner(System.in);
        solve();
        sc.close();
    }
}

public class SinglyLinkedList {// javac Main.java && java Main
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.harsh();
    }
}