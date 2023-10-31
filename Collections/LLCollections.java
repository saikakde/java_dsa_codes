package Collections;

import java.util.*;

public class LLCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(1);
        list.add(3, 4);

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        

    }
}
