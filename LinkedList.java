public class LinkedList{
    // Node class
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // adding data inside the Linked List
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Detecting a loop in the Linked List
    public static boolean detectLoop(){
        // 2 pointer approach
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //Removing the Loop/Cycle from the Linked List
    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle =false;

        while(fast != null && slow != null){
            slow = slow.next;
            fast= fast.next.next;

            if(slow == fast){
                // cycle is detected
                cycle = true;
                break;
            }

        }
        if(cycle= false){
            return;
        }

        // find the meeting point 
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            
            slow = slow.next;
            fast = fast.next;
        }

        // remove the cycle
        prev.next = null;
    }

    //Merge Sort Code
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // midNode
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //1. find the mid
        Node mid = getMid(head);


        //2. left and right half merge Sort
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);


        //3. Merge the Linked List
        return merge(newLeft, newRight);
    }

    // ZIG ZAG Linked List
    public void zigZag(){
        // Find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        // reverse the 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev= null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;


        // alternate merging
        Node nextLeft, nextRight;

        while(leftHead != null && rightHead != null){
            // 4 steps 
            nextLeft = leftHead.next;
            leftHead.next = rightHead;
            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            // updation 
            leftHead = nextLeft;
            rightHead = nextRight;
        }
    }

    // printing the Linked List
    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(detectLoop());
        // removeCycle();
        // System.out.println(detectLoop());
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // ll.printLinkedList();
        // ll.head = ll.mergeSort(ll.head);

        ll.zigZag();
        ll.printLinkedList();
    }
}