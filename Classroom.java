import java.util.LinkedList;

public class Classroom {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(0);

        // priting the Linked List
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        ll.remove(2);

        System.out.println(ll);
    }
}