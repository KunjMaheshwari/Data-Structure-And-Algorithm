//Microsoft Interview

public class QueueLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // Adding the data in the Linked List -> Time complexity is O(1)
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //Removing the data from the Linked List -> Time complexity is O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Linked List is Empty");
                return -1;
            }

            int front = head.data;
            //single element in the linked list 
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }


        //peek -> Time complexity is O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Linked List is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
