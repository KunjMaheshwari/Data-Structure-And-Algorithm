import java.util.*;

public class DequeClass {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);

        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        // similarly removefirst and addlast will work
    }
}
