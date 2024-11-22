import java.util.*;

public class Implementation{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);


        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

// Add - O(logn)
// Remove - O(logn)
// Peek - O(1)

// Comparator in java are interfaces that defines the logic of comparision in java.