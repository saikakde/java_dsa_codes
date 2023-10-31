package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(2);
        d.addLast(3);
        d.addFirst(1);
        d.addLast(4);
        d.addLast(5);

        System.out.println(d);

        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.addFirst(1);
        System.out.println(d);
        System.out.println(d.element());
    }
}
