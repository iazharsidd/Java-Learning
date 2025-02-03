package Queues;
import java.util.*;
public class deck {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        // d.addLast(2);
        d.addFirst(1);
        d.addFirst(5);
        System.out.println(d);
    }
}
