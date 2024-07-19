//Implementing the queue using java collection framework

import java.util.*;

public class QueueJFC {
    public static void main(String[] args) {
        // Queue is an interface and that is why we can't create classes using Queue.
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
